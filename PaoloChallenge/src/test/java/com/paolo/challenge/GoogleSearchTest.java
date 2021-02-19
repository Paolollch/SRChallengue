package com.paolo.challenge;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class GoogleSearchTest {
	
	Website website = new Website();
	
	@Before
	public void setUp() {
		website.setup();
	}
	
	
	@Test
	public void Test() { 
		website.sendText("nombre", "name", "user-submitted-name", "Paolo Llamoza");
		website.sendText("email", "name", "user-submitted-email", "paolollamoza99@gmail.com");
		website.sendText("producto", "name", "user-submitted-title", "Polos");
		website.sendText("paaginaproducto", "name", "user-submitted-url[]", "www.polos.com");
		website.sendText("Descripcion", "name", "user-submitted-content", "vendo polos de color rojo tambien de polos amarillos y de color rosado, pruebaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
	
	
	@After
	public void tearnDown() {
		//driver.quit();
	}
}
