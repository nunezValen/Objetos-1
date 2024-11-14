package io.github.unlp_oo.ejercicio17;
import io.github.unlp_oo.ejercicio14.DateLapse;
import java.time.LocalDate;

public class Reserva {
	private DateLapse periodo;  
	private Propiedad propiedad;
	
	
	public Reserva(DateLapse periodo, Propiedad propiedad) {
		this.periodo = periodo;
		this.propiedad = propiedad;
	}

	public Reserva(LocalDate inicio, LocalDate fin) {
		this.periodo = new DateLapse (inicio,fin);
	}
	
	public int getNoches() {
		return this.periodo.sizeInDays() - 1;
	}
	
	public boolean isOcupado(DateLapse fecha) {
		return (this.periodo.includesDate(fecha.getFrom()) ||
				this.periodo.includesDate(fecha.getTo()));
	}
	
	public void eliminarReserva() {
		this.propiedad.cancelarReserva(this);
	}
	
	
	public double calcularPrecio() {
		return this.getNoches() * this.propiedad.getPrecioPorNoche();
	}
	
}
