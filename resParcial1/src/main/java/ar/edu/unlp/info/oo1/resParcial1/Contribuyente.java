package ar.edu.unlp.info.oo1.resParcial1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contribuyente {
	private String nombre;
	private String dni;
	private String email;
	private String localidad;
	private List<Bien> bienes;
	
	public Contribuyente(String nombre, String dni, String email, String localidad) {
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.localidad = localidad;
		this.bienes = new ArrayList<Bien>();
	}
	
	public String getLocalidad() {
		return this.localidad;
	}
	
	public Inmueble darAltaInmueble(int nroPartida, double valorLote, double valorEdificacion) {
		Inmueble inm = new Inmueble(nroPartida, valorLote, valorEdificacion, this);
		this.bienes.add(inm);
		return inm;
	}
	
	public Automotor darAltaAutomotor(String patente, String marca, String modelo, LocalDate fechaFabricacion, double valor) {
		Automotor auto = new Automotor(patente,marca,modelo,fechaFabricacion,valor, this);
		this.bienes.add(auto);
		return auto;
	}
	
	public Embarcacion darAltaEmbarcacion(String patente, String nombre, LocalDate fechaFabricacion, double valor) {
		Embarcacion embarcacion = new Embarcacion(patente,nombre,fechaFabricacion,valor, this);
		this.bienes.add(embarcacion);
		return embarcacion;
	}
	
	public double calcularImpuestoAPagar() {
		return this.bienes.stream().mapToDouble(bien -> bien.calcularImpuesto()).sum();
	}
}
