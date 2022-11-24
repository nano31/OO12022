package ar.edu.unlp.info.oo1.esquemaExportacion;

import java.time.LocalDate;
import java.util.List;

public class Factura {
	private LocalDate fechaFacturacion;
	private LocalDate fechaExportacion;
	private double costoBasico;
	private double costoExportacion;
	private double costoFinal;
	private List<Item> items;
	
	public Factura(LocalDate fechaFacturacion, LocalDate fechaExportacion, double costoBasico, double costoExportacion, double costoFinal, List<Item> items) {
		this.fechaFacturacion = fechaFacturacion;
		this.fechaExportacion = fechaExportacion;
		this.costoBasico = costoBasico;
		this.costoExportacion = costoExportacion;
		this.costoFinal = costoFinal;
		this.items = items;
	}
	
	public double getCostoFinal() {
		return this.costoFinal;
	}
	
	
}
