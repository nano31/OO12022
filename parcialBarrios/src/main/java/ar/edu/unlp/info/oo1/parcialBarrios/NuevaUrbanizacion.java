package ar.edu.unlp.info.oo1.parcialBarrios;

import java.util.ArrayList;
import java.util.List;

public class NuevaUrbanizacion extends Barrio{
	private double precio;
	
	public NuevaUrbanizacion(String cuidad, int cantLotes, double precio) {
		super(cuidad, cantLotes);
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public double costoLote() {
		return (super.costoTotalMejoras() + this.getPrecio())/super.getCantLotes();
	}

}
