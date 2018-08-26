package br.com.devmedia.exemplo.junit;

import java.util.ArrayList;
import java.util.List;

public class Colecionador {

	private String nome;
	private List<Carro> colecao;
	
	public Colecionador(String nome) {

		this.nome = nome;
		colecao = new ArrayList<Carro>();
	}
		
}
