package ar.edu.unlp.info.oo1.ejercicio11_elInversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Inversion> getInversion() {
		return this.inversiones;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(inversion -> inversion.calcularValor()).sum();
	}

}
