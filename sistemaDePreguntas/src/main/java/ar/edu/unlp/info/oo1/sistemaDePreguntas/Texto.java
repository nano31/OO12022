package ar.edu.unlp.info.oo1.sistemaDePreguntas;

public abstract class Texto {
	private String texto;
	private int votosPositivos;
	private int votosNegativos;
	
	public Texto(String texto) {
		this.texto = texto;
	}
	
	public void cantidadDeVotosPositivos() {
		this.votosPositivos++;
	}
	
	public void cantidadDeVotosNegativos() {
		this.votosNegativos++;
	}
}
