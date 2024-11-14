package ar.edu.unlp.info.oo1.ejercicio6;
import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private java.time.LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	
	//constructor
	public Mamifero (String identificador) {
		this.identificador = identificador;
	}
	public Mamifero () {
		this.identificador = "";
		this.especie = "";
	}
	
	public Mamifero(String identificador, String especie, LocalDate fechaNacimiento, Mamifero padre, Mamifero madre) {
		this.identificador = identificador;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
		this.padre = padre;
		this.madre = madre;
	}
	
	public boolean tieneComoAncestroA(Mamifero m) {
		
		if (m.equals(this.padre) || m.equals(this.madre)) {
			return true;
		}
		
		boolean tieneAncestroEnMadre = ((this.madre != null) && this.madre.tieneComoAncestroA(m));
		boolean tieneAncestroEnPadre = ((this.padre != null) && this.padre.tieneComoAncestroA(m));
		
		return tieneAncestroEnPadre || tieneAncestroEnMadre;
	}
	
	// getters y setters
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public java.time.LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(java.time.LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloMaterno() {
		if  (this.madre != null) {
			return this.madre.getPadre();
		}
		else return null;
	}
	public Mamifero getAbuelaMaterna() {
		if  (this.madre != null) {
			return this.madre.getMadre();
		}
		else return null;
	}
	public Mamifero getAbueloPaterno() {
		if  (this.padre != null) {
			return this.padre.getPadre();
		}
		else return null;
	}
	public Mamifero getAbuelaPaterna() {
		if  (this.padre != null) {
			return this.padre.getMadre();
		}
		else return null;
	}

}
