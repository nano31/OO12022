package ar.edu.unlp.info.oo1.esquemaExportacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String destino;
	private LocalDate fechaExportacion;
	private String nombreEmpresa;
	private List<Item> exportacion;
	
	public Pedido(String destino, LocalDate fechaExportacion, String nombreEmpresa) {
		this.destino = destino;
		this.fechaExportacion = fechaExportacion;
		this.nombreEmpresa = nombreEmpresa;
		this.exportacion = new ArrayList<Item>();
	}
	
	public Bien agregarBien(Pedido pedido, String descripcion, int cantUnidades, double pesoEnKg, double precio) {
		Bien bien = new Bien(pedido,descripcion,cantUnidades,pesoEnKg,precio);
		this.exportacion.add(bien);
		return bien;
	}
	
	public Servicio agregarServicio(Pedido pedido, String descripcion, double costomaterial, double costoManoDeObra) {
		Servicio servicio = new Servicio(pedido,descripcion,costomaterial,costoManoDeObra);
		this.exportacion.add(servicio);
		return servicio;
	}
	
	public double calcularCostoBasico() {
		return this.exportacion.stream().mapToDouble(item -> item.calcularCosto()).sum();
	}
	
	public double calcularCostoExportacion() {
		return this.calcularCostoBasico() * 0.05;
	}
	
	public double calcularCostoFinal() {
		return this.calcularCostoBasico() + this.calcularCostoExportacion();
	}
	
	public Factura crearFactura() {
		double costoFinal = this.calcularCostoFinal();
		double costoExportacion = this.calcularCostoExportacion();
		double costoBasico = this.calcularCostoBasico();
		Factura factura = new Factura(LocalDate.now(), this.fechaExportacion, costoBasico, costoExportacion, costoFinal, this.exportacion);
		return factura;
	}
}
