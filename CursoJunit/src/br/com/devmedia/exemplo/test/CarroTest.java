package br.com.devmedia.exemplo.junit;

import java.time.LocalDate;

import org.junit.Test;

class CarroTest {

	@Test(expected = IllegalArgumentException.class)
	public void testExcecaoAoCriarCarroComAnoDeLancamentoInvalido() {
		new Carro("Mustang", "Ford", 2018, LocalDate.now());
	}

}
