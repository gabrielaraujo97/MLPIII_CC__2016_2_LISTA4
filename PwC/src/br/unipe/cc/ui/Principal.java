package br.unipe.cc.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.unipe.cc.model.Item;

public class Principal {

	public static void main(String[] args) {

		Item i = new Item();
		Item i2 = new Item();
		List<Item> listaItens = new ArrayList<>();

		i2.setDescricao("Bola Nike T90");
		i2.setPrecoItem(150.00);
		i2.setCodigo("0000000002");

		i.setDescricao("Chuteira Adidas Tempt");
		i.setPrecoItem(1700.00);
		i.setCodigo("0000000001");

		listaItens.add(i2);
		listaItens.add(i);

		System.out.println("");
		System.out.println("--- Exibindo lista na ordem que foi adicionada ---");
		System.out.println("--------------------------------------------------");
		for (Item item : listaItens) {
			System.out.println("Nome do Item: " + item.getDescricao());
			System.out.println("Preço do Item: " + item.getPrecoItem());
			System.out.println("Codigo do Item: " + item.getCodigo());
		}

		Collections.sort(listaItens);

		System.out.println("");
		System.out.println("--- Exibindo lista na ordenada atraves do codigo ---");
		System.out.println("----------------------------------------------------");
		for (Item item : listaItens) {
			System.out.println("Nome do Item: " + item.getDescricao());
			System.out.println("Preço do Item: " + item.getPrecoItem());
			System.out.println("Codigo do Item: " + item.getCodigo());
		}

		Collections.reverse(listaItens);
		
		System.out.println("");
		System.out.println("--- Exibindo lista reversa ---");
		System.out.println("------------------------------");
		for (Item item : listaItens) {
			System.out.println("Nome do Item: " + item.getDescricao());
			System.out.println("Preço do Item: " + item.getPrecoItem());
			System.out.println("Codigo do Item: " + item.getCodigo());
		}
	}

}
