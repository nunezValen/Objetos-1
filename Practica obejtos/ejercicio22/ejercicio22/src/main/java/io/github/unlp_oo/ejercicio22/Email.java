package io.github.unlp_oo.ejercicio22;
import java.util.*;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> archivos;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public List<Archivo> getArchivos() {
		return archivos;
	}
	public void setArchivos(List<Archivo> archivos) {
		this.archivos = archivos;
	}
	
	
	public int espacioOcupado() {
		return this.titulo.length() + this.cuerpo.length() + 
				this.archivos.stream().mapToInt(a -> a.tamaño()).sum();
	}
	
	public String getCategoria() {
		return Tamaños.getTamaño(this.espacioOcupado());
	}
	
}
