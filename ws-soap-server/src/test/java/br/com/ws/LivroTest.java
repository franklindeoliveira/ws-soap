package br.com.ws;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LivroTest {

	@Before
	public void before() {
		Servidor.iniciar();
	}

	@After
	public void after() {
		Servidor.parar();
	}

	@Test
	public void testaAdicionaLivro() {
		
	}

	@Test
	public void testaBuscaLivro() {
		
	}
	
	@Test
	public void testaAtualizaLivro() {
		
	}
	
	@Test
	public void testaRemoveLivro() {
		
	}

}
