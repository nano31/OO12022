package ar.edu.unlp.info.oo1.sistemaDePreguntas;

import java.util.List;

public class Usuario {
	private String nombre;
	private String email;
	private List<Texto> preguntas;
	
	public Usuario(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}
	
	public Texto crearPreguntaTecnica(String texto) {
		Texto pregunta = new PreguntaTecnica(texto);
		this.preguntas.add(pregunta);
		return pregunta;
	}
	
	public Texto crearPreguntaDeInteresGeneral(String texto) {
		Texto preg = new PreguntaDeInteresGeneral(texto);
		this.preguntas.add(preg);
		return preg;
	}
}
