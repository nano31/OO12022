package ar.edu.unlp.info.oo1.esquemaExportacion;

public abstract class Item {
	private String descripcion;
	private Pedido pedido;
	
	public Item(Pedido pedido, String descripcion) {
		this.pedido = pedido;
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public Pedido getPedido() {
		return this.pedido;
	}
	
	public abstract double calcularCosto();
}
