package ar.edu.unlp.info.oo1.ejercicio7;
import java.util.List;
import java.util.ArrayList;

public class Farola {
	private List<Farola> vecinos;
	private boolean encendida;
	
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola() {
		this.encendida = false;
		vecinos = new ArrayList<Farola>();
	}
	
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		if (!this.vecinos.contains(otraFarola)) {
			this.vecinos.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return this.vecinos;
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (this.isOff()) {
			this.encendida = true;
			this.getNeighbors().forEach(farola -> farola.turnOn());
		}
		
		/* asi lo pensé yo
		if ((!this.encendida)) {
			this.encendida = true;
		}
		for (Farola vecino : vecinos) {
		if (vecino != null) {
			vecino.turnOn();
		}
		}
		*/
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (this.isOn()) {
			this.encendida = false;
			this.getNeighbors().forEach(farola -> farola.turnOff());
		}
	}
	
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.encendida;
	}
	
	public boolean isOff() {
		return !this.encendida;
	}

}
