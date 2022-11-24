package ar.edu.unlp.info.oo1.sistemaDePreguntas;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Usuario> usuarios;
	
	public Sistema(){
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario registrarUsuario(String nombre, String email) {
		Usuario usr = new Usuario(nombre,email);
		this.usuarios.add(usr);
		return usr;
	}
	
	public Texto crearPreguntaTecnica(String texto, Usuario usuario) {
		Texto pregunta = usuario.crearPreguntaTecnica(texto);
		return pregunta;
	}
	
	public Texto crearPreguntaDeInteresGeneral(String texto, Usuario usuario) {
		Texto preg = usuario.crearPreguntaDeInteresGeneral(texto);
		return preg;
	}
}
