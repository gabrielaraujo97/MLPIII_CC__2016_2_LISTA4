package br.unipe.cc.ui;

import java.util.Collections;

import br.unipe.cc.model.Estoque;
import br.unipe.cc.model.Produtos;

public class Principal {

	public static void main(String[] args) {

		Produtos p = new Produtos();
		Produtos p2 = new Produtos();
		Estoque e = new Estoque();

		p.setNome("XboX One");
		p.setValor(1500.00);
		p.setCodigoProduto("001");

		p2.setNome("Processador INTEL CORE i7");
		p2.setValor(800.00);
		p2.setCodigoProduto("003");

		e.setListaProdutos(p);
		e.setListaProdutos(p2);

		e.setNomeEstoque("Lojas VSF");
		System.out.println("Estoque das " + e.getNomeEstoque());

		for (Produtos produtos : e.getListaProdutos()) {
			System.out.println("Nome do Produto: " + produtos.getNome());
			System.out.println("Valor do produto: " + produtos.getValor());
			System.out.println("Codigo do produto: " + produtos.getCodigoProduto());
			System.out.println();
		}

	}

}
