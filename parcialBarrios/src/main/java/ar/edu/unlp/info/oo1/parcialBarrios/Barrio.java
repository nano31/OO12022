package ar.edu.unlp.info.oo1.parcialBarrios;

import java.util.ArrayList;
import java.util.List;

public abstract class Barrio {
	private List<Mejora> mejoras;
	private String ciudad;
	private int cantLotes;
	
	public Barrio(String cuidad, int cantLotes) {
		this.ciudad = ciudad;
		this.cantLotes = cantLotes;
		this.mejoras = new ArrayList<Mejora>();
	}

	public List<Mejora> getMejoras(){
		return this.mejoras;
	}
	
	public double costoTotalMejoras() {
		return this.mejoras.stream().mapToDouble(mejora -> mejora.getCosto()).sum();
	}
	
	public abstract double costoLote();
	
	public int getCantLotes() {
		return this.cantLotes;
	}
}
