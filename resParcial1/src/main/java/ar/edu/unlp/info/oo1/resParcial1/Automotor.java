package ar.edu.unlp.info.oo1.resParcial1;

import java.time.LocalDate;

public class Automotor extends Motorizado {
	private String marca;
	private String modelo;
	
	public Automotor(String patente, String marca, String modelo, LocalDate fechaFabricacion, double valor, Contribuyente contribuyente) {
		super(patente, valor, fechaFabricacion,contribuyente);
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public double calcularImpuesto() {
		if (this.antiguedad(this.fechaFabricacion,LocalDate.now()) > 10) {
			return 0;
		}else {
			return this.valor + (this.valor * 0.5);
		}
	}

}
