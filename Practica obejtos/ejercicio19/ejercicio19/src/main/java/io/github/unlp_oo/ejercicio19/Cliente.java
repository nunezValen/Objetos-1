package io.github.unlp_oo.ejercicio19;
import java.util.*;

import io.github.unlp_oo.ejercicio14.DateLapse;


public abstract class Cliente {
	protected String nombre;
	protected String dir;
	protected List<Envio> envios;
	
	public Cliente(String n, String d) {
		this.nombre = n;
		this.dir = d;
		this.envios = new ArrayList<Envio>();
	}
	
	public void agregarEnvio(Envio e) {
		this.envios.add(e);
	}
	
	public abstract double calcularMonto(DateLapse fecha);
	
}
