package io.github.unlp_oo.ejercicio20;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class ContratoDePlanta extends Contrato{
	
	private LocalDate fechaInicio;
	private double sueldoMensual;
	private double montoHijos;
	private double montoConyuge;
	
	public ContratoDePlanta(Empleado e,LocalDate i, double mc, double mh, double s) {
		super(e);
		this.fechaInicio = i;
		this.montoConyuge=mc;
		this.montoHijos = mh;
		this.sueldoMensual=s;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isVigente(LocalDate i) {
		return true;
	}

	
	private double getBonificaciones() {
		double total=0;
		if(this.getEmpleado().isHijosAcargo()) {
			total += this.montoHijos;
		}
		if (this.getEmpleado().isConyuge()) {
			total+=this.montoConyuge;
		}
		return total;
	}
	
	
	@Override
	public double calcularMonto() {
		return this.sueldoMensual + this.getBonificaciones() ;
	}
	
	@Override
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}

	@Override
	public int getAntiguedad(LocalDate hoy) {
		return (int) this.fechaInicio.until(hoy, ChronoUnit.DAYS);
	}

}
