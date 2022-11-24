package ar.edu.unlp.info.oo1.esquemaExportacion;

public class Servicio extends Item{
	private double costoMaterial;
	private double costoManoDeObra;
	
	public Servicio(Pedido pedido, String descripcion, double costomaterial, double costoManoDeObra) {
		super(pedido,descripcion);
		this.costoMaterial = costoMaterial;
		this.costoManoDeObra = costoManoDeObra;
	}
	
	public double getCostoMaterial() {
		return this.costoMaterial;
	}
	
	public double getCostoManoDeObra() {
		return this.costoManoDeObra;
	}
	
	public double calcularCosto() {
		return this.getCostoMaterial() + this.getCostoManoDeObra();
	}
}
