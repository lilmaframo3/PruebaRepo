package es.curso.junit;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class IntroduccionHamcrestTest {

	@Before
	public void setUp() {
	}
  
	@SuppressWarnings("deprecation")
	@Test
	public void ejemploinicialesHamcrest() {
		
		String Cadena = "Hola Mundo";

		//Comparativa//
		Assert.assertEquals("Hola Mundo", Cadena);
		Assert.assertThat(Cadena, Is.is("Hola Mundo"));
	}

	
	}

