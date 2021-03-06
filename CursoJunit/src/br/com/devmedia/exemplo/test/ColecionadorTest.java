package br.com.devmedia.exemplo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.devmedia.exemplo.junit.Carro;
import br.com.devmedia.exemplo.junit.Colecionador;


class ColecionadorTest {

	@Test
	public void testCarroComAnoDeLancamentoMaisAntigo() {
		
		Colecionador devmedia = new Colecionador("Devmedia");
		
		Carro carro1 = new Carro("Mustang", "Ford", 1994 , LocalDate.now());
		Carro carro2 = new Carro("Enzo", "Ferrari", 2002, LocalDate.now());
		Carro carro3 = new Carro("Urus", "Lamborghini", 2017, LocalDate.now());
		
		devmedia.getColecao().add(carro1);
		devmedia.getColecao().add(carro2);
		devmedia.getColecao().add(carro3);
		
		Assert.assertEquals(1994, devmedia.obterAnoDoCarroMaisAntigo());
	}

}
