package ar.edu.unlp.info.oo1.ejercicio9;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCajaDeAhorro {
	
	private CajaDeAhorro cuenta1; 
	private CajaDeAhorro cuenta2;
	
	@BeforeEach //aca solo instancio
	void setUp() throws Exception{
		cuenta1 = new CajaDeAhorro();
		cuenta2 = new CajaDeAhorro();
	}
	
	@Test
	void testConstructor() {
		assertEquals(0,cuenta1.getSaldo());
	}
	
	@Test //un test para cada cosa
	void testDepositar() {
		cuenta1.depositar(1200.00);
		assertEquals(960, cuenta1.getSaldo());
	}
	
	@Test
	void testExtraer() {
		cuenta1.depositar(1000);
		assertTrue(cuenta1.extraer(100));
		assertEquals(680,cuenta1.getSaldo());
		
		assertFalse(cuenta1.extraer(1200));
	}
	
	@Test
	void testTransferirACuenta() {
		assertFalse(cuenta1.transferirACuenta(10, cuenta2));
		
		cuenta1.depositar(1000);
		assertTrue(cuenta1.transferirACuenta(10, cuenta2));
		assertEquals(10,cuenta2.getSaldo());
	}

}
