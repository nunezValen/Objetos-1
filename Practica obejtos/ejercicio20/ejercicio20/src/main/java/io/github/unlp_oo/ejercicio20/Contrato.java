package io.github.unlp_oo.ejercicio20;

import java.time.LocalDate;

public abstract class Contrato {
	private Empleado empleado;
	
		
	public Contrato( Empleado e) {
		this.empleado = e;
	}
	
	
	
	public Empleado getEmpleado() {
		return empleado;
	}



	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public abstract int getAntiguedad(LocalDate hoy);
	
	public abstract LocalDate getFechaInicio();
	
	public abstract boolean isVigente(LocalDate i);
	
	public abstract double calcularMonto ();
	
	
	
}
