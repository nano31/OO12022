package ar.edu.unlp.info.oo1.resParcial1;

import java.time.LocalDate;

public class Embarcacion extends Motorizado{
	private String nombre;
	
	public Embarcacion(String patente, String nombre, LocalDate fechaFabricacion, double valor,Contribuyente contribuyente) {
		super(patente, valor, fechaFabricacion, contribuyente);
		this.nombre = nombre;
	}

	@Override
	public double calcularImpuesto() {
		if (this.antiguedad(this.fechaFabricacion,LocalDate.now()) > 10) {
			return 0;
		}else if(this.valor < 1000000){
			return this.valor + (this.valor * 0.1);
		}else {
			return this.valor + (this.valor * 0.15);
		}
	}

}
