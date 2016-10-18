package br.unipe.cc.model;

public class Produtos implements Comparable<Produtos> {

	private String nome;
	private String codigoProduto;
	private double valor;

	/**
	 * Ordenando os produtos pelo código...
	 */
	public int compareTo(Produtos aux) {
		return this.codigoProduto.compareTo(aux.codigoProduto);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
