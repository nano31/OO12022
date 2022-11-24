package ar.edu.unlp.info.oo1.resParcial1;

public abstract class Bien {
	private Contribuyente contribuyente;
	
	public Bien(Contribuyente contribuyente) {
		this.contribuyente = contribuyente;
	}
	
	public abstract double calcularImpuesto();
}
