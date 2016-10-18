package br.unipe.cc.model.test;

import br.unipe.cc.model.Item;
import junit.framework.TestCase;

public class TestItem extends TestCase {

	private Item i;
	private Item i2;

	public void setUp() {
		i = new Item();
		i2 = new Item();
		i.setDescricao("Bola de Futebol");
		i.setCodigo("000002");
		i2.setDescricao("Chuteira");
		i2.setCodigo("000003");
	}
	
	public void tearDown(){
		i = null;
		i2 = null;
	}
	
	public void testCompareTo(){
		assertEquals(i.compareTo(i2), -1);
	}
	
}
