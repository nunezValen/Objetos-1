package io.github.unlp_oo.ejercicio20;

import java.time.LocalDate;
import io.github.unlp_oo.ejercicio14.DateLapse;
import java.time.temporal.ChronoUnit;
public class ContratoPorHoras extends Contrato{
	
	private double valorPorHora;
	private int horasPorMes;
	private DateLapse duracion;
	
	public ContratoPorHoras(Empleado e,LocalDate i, double vh, int hm, LocalDate f) {
		super(e);
		this.horasPorMes = hm;
		this.valorPorHora = vh;
		this.duracion = new DateLapse(i,f);
	}

	
	
	@Override
	public boolean isVigente(LocalDate i) {
		return this.duracion.includesDate(i);
	}
	
	
	
	@Override
	public double calcularMonto() {
		return this.valorPorHora * this.horasPorMes;
	}

	
	public int getAntiguedad(LocalDate hoy) {
		if (this.isVigente(hoy)){
			return (int) this.duracion.getFrom().until(hoy,ChronoUnit.DAYS);
		}
		return this.duracion.sizeInDays();
	}
	

	@Override
	public LocalDate getFechaInicio() {
		return this.duracion.getFrom();
	}



}
