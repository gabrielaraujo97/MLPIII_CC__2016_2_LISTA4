package br.unipe.cc.model.test;

import br.unipe.cc.model.Produtos;
import junit.framework.TestCase;

public class TestProdutos extends TestCase {

	private Produtos p1;
	private Produtos p2;
	
	public void setUp(){
		p1 = new Produtos();
		p2 = new Produtos();
		p1.setNome("Placa De Video");
		p1.setCodigoProduto("000001");
		p2.setNome("Processador");
		p2.setCodigoProduto("000002");
		
 	}
	
	public void tearDown(){
		p1 = null;
		p2 = null;
	}
	
	public void testCompareTo(){
		assertEquals(p1.compareTo(p2), -1);
	}
	
}
