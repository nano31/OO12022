package ar.edu.unlp.info.oo1.ejercicio11_elInversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InversionEnPlazoFijo extends Inversion {
	private LocalDate fechaConstitucion;
	private double montoDepositado;
	private double porcentajeInteres;
	
	public InversionEnPlazoFijo(LocalDate fechaConstitucion, double montoDepositado, double porcentajeInteres) {
		this.fechaConstitucion = fechaConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeInteres = porcentajeInteres;
	}
	
	public double calcularValor() {
		long dias = ChronoUnit.DAYS.between(fechaConstitucion, LocalDate.now());
		return this.montoDepositado + (this.montoDepositado * this.porcentajeInteres * dias);
	}
	
	
}
