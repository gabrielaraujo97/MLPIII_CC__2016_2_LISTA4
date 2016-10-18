package br.unipe.cc.model;

import java.util.HashSet;
import java.util.Set;

public class Estoque {

	private String nomeEstoque;
	/**
	 * Estou usando SET, pois os elementos não podem se repetir!
	 */
	Set<Produtos> listaProdutos = new HashSet<>();

	public Set<Produtos> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(Produtos p) {
		this.listaProdutos.add(p);
	}

	public String getNomeEstoque() {
		return nomeEstoque;
	}

	public void setNomeEstoque(String nomeEstoque) {
		this.nomeEstoque = nomeEstoque;
	}

}
