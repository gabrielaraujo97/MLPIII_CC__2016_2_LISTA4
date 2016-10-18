package br.unipe.cc.util;

import java.util.Scanner;
/**
 * Professor, esta classe foi cedida por Bruno Cesar, visando agilizar a resolu��o do exercicio 3 Lista 2.
 * @author Gabriel_2
 *
 */
public class Util {

	private int opcao;
	private Scanner leitor = new Scanner(System.in);

	public int Menu() {

		System.out.println("Digite sua Op��o:");
		System.out.println("");
		System.out.println("1 - Incluir alunos");
		System.out.println("2 - Remover aluno (por nome ou matr�cula)");
		System.out.println("3 - Verificar se um aluno est� matriculado (por matr�cula)");
		System.out.println("4 - Listar todos os alunos aprovados (m�dia superior � 7,0)");
		System.out.println("5 - Listar todos os alunos reprovados por falta (faltas superiores � 15 faltas)");
		System.out.println("6 - Listar por ordem alfab�tica");
		System.out.println("0 - Sair");

		this.opcao = Integer.parseInt(ler());

		return opcao;
	}

	public String ler() {
		return leitor.next();
	}

}