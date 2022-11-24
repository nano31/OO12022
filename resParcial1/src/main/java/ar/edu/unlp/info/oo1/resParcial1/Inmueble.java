package ar.edu.unlp.info.oo1.resParcial1;

public class Inmueble extends Bien{
	private int nroPartida;
	private double valorLote;
	private double valorEdificacion;
	
	public Inmueble(int nroPartida, double valorLote, double valorEdificacion, Contribuyente contribuyente) {
		super(contribuyente);
		this.nroPartida = nroPartida;
		this.valorLote = valorLote;
		this.valorEdificacion = valorEdificacion;
	}
	
	public double calcularValorInmueble() {
		return this.valorLote + this.valorEdificacion;
	}
	
	@Override
	public double calcularImpuesto() {
		return this.calcularValorInmueble() + (this.calcularValorInmueble() * 0.01);
	}
	
}
