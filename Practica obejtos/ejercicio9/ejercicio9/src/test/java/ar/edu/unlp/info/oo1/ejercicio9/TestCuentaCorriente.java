package ar.edu.unlp.info.oo1.ejercicio9;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuentaCorriente {
	
	private CuentaCorriente cuenta1; 
	private CuentaCorriente cuenta2;
	
	@BeforeEach //aca solo instancio
	void setUp() throws Exception{
		cuenta1 = new CuentaCorriente();
		cuenta2 = new CuentaCorriente();
	}
	
	@Test
	void testConstructor() {
		assertEquals(0,cuenta1.getSaldo());
		assertEquals(0,cuenta1.getDescubierto());
	}
	
	@Test //un test para cada cosa
	void testDepositar() {
		cuenta1.depositar(1200.00);
		assertEquals(1200, cuenta1.getSaldo());
	}
	
	@Test
	void testExtraer() {
		assertTrue(cuenta1.extraer(800));
		assertEquals(400,cuenta1.getSaldo());
		
		assertFalse(cuenta1.extraer(1200));
	}
	
	@Test
	void testTransferirACuenta() {
		assertFalse(cuenta1.transferirACuenta(100000, cuenta2));
		
		assertTrue(cuenta1.transferirACuenta(10, cuenta2));
		assertEquals(10,cuenta2.getSaldo());
	}

}