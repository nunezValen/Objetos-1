package io.github.unlp_oo.ejercicio14;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DateLapse {
	
	private java.time.LocalDate from;
	private java.time.LocalDate to;
	
	public DateLapse() {
		from = LocalDate.of(15, 9, 1972);
		to = LocalDate.of(15, 12, 2032);
	}
	
	public DateLapse(LocalDate I, LocalDate f) {
		from = I;
		to = f;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}

	public LocalDate getTo() {
		return this.to;
	}
	
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(this.to, this.from);
		//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
		// vi que tambien hacen:
		//return (int) this.getFrom().until(this.getTo(), ChronoUnit.DAYS);
	}
	

	public boolean includesDate(LocalDate other) {
		//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
		return other.isBefore(this.to) && other.isAfter(this.from);
	}
	

}
