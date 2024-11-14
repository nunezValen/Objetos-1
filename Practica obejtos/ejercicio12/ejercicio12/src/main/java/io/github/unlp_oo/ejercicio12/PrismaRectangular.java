package io.github.unlp_oo.ejercicio12;

public class PrismaRectangular extends Pieza{
	private int ladoMenor;
	private int ladoMayor;
	private int altura;
	
	public PrismaRectangular() {
		this.ladoMayor=0;
		this.altura = 0;
		this.ladoMenor = 0;
	}
	
	public int getLadoMenor() {
		return ladoMenor;
	}
	public void setLadoMenor(int ladoMenor) {
		this.ladoMenor = ladoMenor;
	}
	public int getLadoMayor() {
		return ladoMayor;
	}
	public void setLadoMayor(int ladoMayor) {
		this.ladoMayor = ladoMayor;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public double getVolumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	@Override
	public double getSuperficie() {
		return 2* (this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
	}
	
	
	
}
