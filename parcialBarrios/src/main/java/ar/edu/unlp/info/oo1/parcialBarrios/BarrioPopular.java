package ar.edu.unlp.info.oo1.parcialBarrios;

import java.util.ArrayList;
import java.util.List;

public class BarrioPopular extends Barrio{
	private double honorarios;
	private double gastosRegistro;
	
	public BarrioPopular(String cuidad, int cantLotes, double honorarios, double gastosRegistro) {
		super(cuidad, cantLotes);
		this.honorarios = honorarios;
		this.gastosRegistro = gastosRegistro;
	}
	
	public double getHonorarios() {
		return this.honorarios;
	}
	
	public double getGastosRegistro() {
		return this.gastosRegistro;
	}
	
	public double costoLote() {
		return (super.costoTotalMejoras()/super.getCantLotes()) + this.getHonorarios() + this.getGastosRegistro();
	}

}
