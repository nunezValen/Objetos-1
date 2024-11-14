package io.github.unlp_oo.ejercicio14B;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DateLapse2 {
	
	private java.time.LocalDate from;
	private int sizeInDays;
	
	public DateLapse2() {
		from = LocalDate.of(15, 9, 1972);
		sizeInDays = 100;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}

	public LocalDate getTo() {
		return this.getFrom().plusDays(100);
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
		//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
		return other.isBefore(this.getTo()) && other.isAfter(this.getFrom());
	}
	

}
