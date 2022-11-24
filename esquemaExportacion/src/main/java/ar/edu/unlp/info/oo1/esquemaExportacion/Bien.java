package ar.edu.unlp.info.oo1.esquemaExportacion;

public class Bien extends Item {
	private int cantUnidades;
	private double pesoEnKg;
	private double precio;
	
	public Bien(Pedido pedido, String descripcion, int cantUnidades, double pesoEnKg, double precio) {
		super(pedido, descripcion);
		this.cantUnidades = cantUnidades;
		this.pesoEnKg = pesoEnKg;
		this.precio = precio;
	}
	
	public double getPesoEnKg() {
		return this.pesoEnKg;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public int getCantUnidades() {
		return this.cantUnidades;
	}
	
	public double calcularPeso() {
		return this.getPesoEnKg() * this.getCantUnidades();
	}
	
	public double calcularCosto() {
		double precio = this.getCantUnidades() * this.getPrecio();
		if (this.calcularPeso() < 1000) {
			return precio;
		}else {
			return precio += (precio * 0.1);
		}
	}
}
