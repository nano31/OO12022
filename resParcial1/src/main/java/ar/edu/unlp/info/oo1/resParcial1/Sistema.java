package ar.edu.unlp.info.oo1.resParcial1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private List<Contribuyente> contribuyentes;
	
	public Sistema() {
		this.contribuyentes = new ArrayList<Contribuyente>();
	}
	
	public Contribuyente altaContribuyente(String nombre, String dni, String email, String localidad) {
		Contribuyente contribuyente = new Contribuyente(nombre,dni,email,localidad);
		this.contribuyentes.add(contribuyente);
		return contribuyente;
	}
	
	public Bien altaInmueble(int nroPartida, double valorLote, double valorEdificacion, Contribuyente contribuyente) {
		Bien inmueble = contribuyente.darAltaInmueble(nroPartida, valorLote, valorEdificacion);
		return inmueble;
	}
	
	public Bien altaAutomotor(String patente, String marca, String modelo, LocalDate fechaFabricacion, double valor, Contribuyente contribuyente) {
		Bien automotor = contribuyente.darAltaAutomotor(patente, marca, modelo, fechaFabricacion, valor);
		return automotor;
	}
	
	public Bien altaEmbarcacion(String patente, String nombre, LocalDate fechaFabricacion, double valor,Contribuyente contribuyente) {
		Bien embarcacion = contribuyente.darAltaEmbarcacion(patente, nombre, fechaFabricacion, valor);
		return embarcacion;
	}
	
	public List<Contribuyente> masPaganPorLocalidad(String localidad, int cantidad){
		
		return this.contribuyentes.stream()
			.filter(c -> c.getLocalidad().equals(localidad))
			.sorted((c1, c2) -> (c2.calcularImpuestoAPagar().compareTo(c1.calcularImpuestoAPagar()))
			.limit(cantidad)
			.Collectors(Collector.toList());
	}
}
