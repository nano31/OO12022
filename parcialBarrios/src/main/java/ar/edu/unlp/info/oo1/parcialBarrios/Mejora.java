package ar.edu.unlp.info.oo1.parcialBarrios;

public class Mejora {
	private double costo;
	private String descripcion;
	
	public Mejora(double costo, String descripcion) {
		this.costo = costo;
		this.descripcion = descripcion;
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	public String getDescricion() {
		return this.descripcion;
	}
}
