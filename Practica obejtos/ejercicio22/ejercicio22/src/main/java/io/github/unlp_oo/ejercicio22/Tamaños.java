package io.github.unlp_oo.ejercicio22;

public class Tamaños {
	
	private static int pequeño;
	private static int mediano ;
	private static int grande ;
	
	public Tamaños(){
		pequeño = 300;
		mediano = 500;
		grande = 501;
	}

	public static int getPequeño() {
		return pequeño;
	}

	public static void setPequeño(int pequeño) {
		Tamaños.pequeño = pequeño;
	}

	public static int getMediano() {
		return mediano;
	}

	public static void setMediano(int mediano) {
		Tamaños.mediano = mediano;
	}

	public static int getGrande() {
		return grande;
	}

	public static void setGrande(int grande) {
		Tamaños.grande = grande;
	}
	
	public static String getTamaño(int cantidad) {
		if (cantidad <= pequeño) {
			return "Pequeño";
		} else if (cantidad <=500) {
			return "Mediano";
		}
		return "Grande";
	}
	
}
