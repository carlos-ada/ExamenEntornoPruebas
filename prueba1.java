import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Prueba1 {

	static Funcion1 funcion = null;
			
	@Test
	@DisplayName("Test de Caja Negra Valor Limite Inferior")
	
	void PruebaFuncion1() {
		assertEquals(false,funcion.funcion1(Integer.MIN_VALUE)); 
	}
}
