package io.github.unlp_oo.ejercicio23;

public class EnvioExpress implements TipoDeEnvio {
	
	private String dir1;
	private String dir2;
	
	public EnvioExpress(String d1, String d2) {
		this.dir1 = d1;
		this.dir2 = d2;
	}
	
	@Override
	public double getAdicionalPorEnvio() {
		// TODO Auto-generated method stub
		return CalculadoraDeDistancia.calcularMonto(this.dir1, this.dir2);
	}

}
