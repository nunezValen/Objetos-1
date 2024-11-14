package io.github.unlp_oo.ejercicio14B;

import java.time.LocalDate;

public interface Date {
	
	
	public LocalDate getFrom();
	
	public LocalDate getTo();
	
	public int sizeInDays();
	
	public boolean includesDate();
	
	
}
