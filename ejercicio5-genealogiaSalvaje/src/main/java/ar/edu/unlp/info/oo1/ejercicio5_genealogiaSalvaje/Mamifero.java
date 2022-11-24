package ar.edu.unlp.info.oo1.ejercicio5_genealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero {
	private String nombre;
	private int identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public Mamifero(String nombre, int identificador, String especie, LocalDate fechaNacimiento, Mamifero madre, Mamifero padre) {
		this.nombre = nombre;
		this.identificador = identificador;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
		this.madre = madre;
		this.padre = padre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Mamifero getAbueloPaterno(Mamifero unMamifero) {
		if (this.getPadre() != null) {
			return this.getPadre().getPadre();
		}else {
			return null;
		}
	}
	
	public Mamifero getAbuelaPaterna(Mamifero unMamifero) {
		if(this.getPadre() != null) {
			return this.getPadre().getMadre();
		}else{
			return null;
		}
	}
	
	public Mamifero getAbueloMaterno(Mamifero unMamifero) {
		if(this.getMadre() != null) {
			return this.getMadre().getPadre();
		}else {
			return null;
		}
	}
	
	public Mamifero getAbuelaMaterna(Mamifero unMamifero) {
		if(this.getMadre() != null) {
			return this.getMadre().getMadre();
		}else {
			return null;
		}
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return (tieneAncestro(this.getMadre(),unMamifero) || tieneAncestro(this.getPadre(), unMamifero));
	}
	
	
	public boolean tieneAncestro (Mamifero pariente, Mamifero mamifero) {
		return ((pariente != null) && (mamifero.equals(pariente)) || pariente.tieneComoAncestroA(mamifero)); 
	}
	
	
	
	
}
