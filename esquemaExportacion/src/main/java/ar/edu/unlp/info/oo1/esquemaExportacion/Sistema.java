package ar.edu.unlp.info.oo1.esquemaExportacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Pedido> pedidos;
	private List<Factura> facturasDeExportacion;
	
	public Sistema() {
		this.pedidos = new ArrayList<Pedido>();
		this.facturasDeExportacion = new ArrayList<Factura>();
	}
	
	public Pedido altaPedido(String destino, LocalDate fechaExportacion, String nombreEmpresa) {
		Pedido pedido = new Pedido(destino, fechaExportacion, nombreEmpresa);
		this.pedidos.add(pedido);
		return pedido;
	}
	
	public Bien agregarBien(Pedido pedido, String descripcion, int cantUnidades, double peso, double precio) {
		Bien bien = pedido.agregarBien(pedido,descripcion, cantUnidades,peso,precio);
		return bien;
	}
	
	public Servicio agregarServicio(Pedido pedido, String descripcion, double costoMaterial, double costoManoDeObra) {
		Servicio servicio = pedido.agregarServicio(pedido, descripcion, costoMaterial, costoManoDeObra);
		return servicio;
	}
	
	public Factura facturarPedido(Pedido pedido) {
		Factura facturaDePedido = pedido.crearFactura();
		this.facturasDeExportacion.add(facturaDePedido);
		return facturaDePedido;
	}
	
	public Factura facturaMayorCostoFinal(LocalDate fecha1, LocalDate fecha2) {
		return this.facturasDeExportacion.stream().max((f1, f2) -> Double.compare(f1.getCostoFinal(), f2.getCostoFinal())).orElse(null);
	}
}
