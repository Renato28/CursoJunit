package br.com.devmedia.exemplo.junit;

import java.time.LocalDate;

public class Carro {

	private String modelo;
	private String marca;
	private int anoLancamento;
	private LocalDate dataAquisicao;

	public Carro(String modelo, String marca, int anoLancamento, LocalDate dataAquisicao) {
		super();

		if (anoLancamento > dataAquisicao.getYear()) {
			throw new IllegalArgumentException("Ano de lançamento não pode ser maior que o ano de aquisição do carro.");
		}
		this.modelo = modelo;
		this.marca = marca;
		this.anoLancamento = anoLancamento;
		this.dataAquisicao = dataAquisicao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

}
