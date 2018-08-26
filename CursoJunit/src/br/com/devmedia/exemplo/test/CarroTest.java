package br.com.devmedia.exemplo.test;

import java.time.LocalDate;

import org.junit.Test;

import br.com.devmedia.exemplo.junit.Carro;

class CarroTest {

	@Test(expected = IllegalArgumentException.class)
	public void testExcecaoAoCriarCarroComAnoDeLancamentoInvalido() {
		new Carro("Mustang", "Ford", 2018, LocalDate.now());
	}

}
