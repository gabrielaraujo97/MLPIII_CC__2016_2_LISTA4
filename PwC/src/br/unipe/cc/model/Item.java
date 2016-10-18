package br.unipe.cc.model;

public class Item implements Comparable<Item> {

	private String codigo;
	private String descricao;
	private double precoItem;

	public int compareTo(Item aux) {
		return this.codigo.compareTo(aux.codigo);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}

}
