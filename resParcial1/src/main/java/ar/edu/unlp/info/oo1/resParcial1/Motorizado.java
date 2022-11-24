package ar.edu.unlp.info.oo1.resParcial1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Motorizado extends Bien {
	private String patente;
	protected double valor;
	protected LocalDate fechaFabricacion;
	private Contribuyente contribuyente;
	
	public Motorizado(String patente, double valor, LocalDate fechaFabricacion, Contribuyente contribuyente) {
		super(contribuyente);
		this.patente = patente;
		this.valor = valor;
		this.fechaFabricacion = fechaFabricacion;
	}
	
	public int antiguedad(LocalDate fechaFabricacion, LocalDate fechaComparacion) {
		return (int) ChronoUnit.YEARS.between(fechaFabricacion, fechaComparacion);
	}
}
