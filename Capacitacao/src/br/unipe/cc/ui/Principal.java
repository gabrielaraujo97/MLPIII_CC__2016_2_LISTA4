package br.unipe.cc.ui;

import java.util.Collections;
import java.util.Scanner;

import br.unipe.cc.model.Aluno;
import br.unipe.cc.model.Curso;
import br.unipe.cc.model.Professor;
import br.unipe.cc.util.Util;

public class Principal {

	public static void main(String[] args) {

		Util utilidade = new Util();
		Aluno a = new Aluno();
		Professor p = new Professor();
		Curso ingles = new Curso();
		int opcao;
		String aux;
		Scanner leitor = new Scanner(System.in);

		ingles.setNumeroId(1);
		ingles.setNome("Curso de Ingles");

		p.setNome("João do Ingles");
		p.setMatricula("000001");
		p.setEspecialidade("Ingles");

		ingles.setProfessor(p);

		do {
			opcao = utilidade.Menu();
			switch (opcao) {
			case 1:
				a = new Aluno();

				System.out.println("Digite a matricula do aluno : ");
				a.setMatricula(leitor.nextLine());

				System.out.println("Digite o nome do aluno : ");
				a.setNome(leitor.nextLine());

				System.out.println("Digite a media do aluno : ");
				a.setMedia(leitor.nextDouble());

				leitor.nextLine();// LIMPANDO O SCANNER

				System.out.println("Digite a quantidade de faltas : ");
				a.setQtdFaltas(leitor.nextInt());

				leitor.nextLine();// LIMPANDO O SCANNER

				ingles.setAlunos(a);

				break;

			case 2:
				System.out.println("Digite nome/matricula do aluno : ");
				aux = leitor.nextLine();
				for (Aluno alunos : ingles.getAlunos()) {
					if (alunos.getMatricula().equals(aux)) {
						ingles.getAlunos().remove(alunos);
					}
					if (alunos.getNome().equals(aux)) {
						ingles.getAlunos().remove(alunos);
					}
				}
				System.out.println("");
				break;

			case 3:
				System.out.println("Digite a matricula do aluno que deseja verificar : ");
				aux = leitor.nextLine();
				for (Aluno alunos : ingles.getAlunos()) {
					if (alunos.getMatricula().equals(aux)) {
						System.out.println("O aluno está matriculado!!!");
					} else
						System.out.println("O aluno não está matriculado!!!");
				}
				break;

			case 4:
				System.out.println("--- LISTA DE APROVADOS ---");
				for (Aluno alunos : ingles.getAlunos()) {
					if (alunos.getMedia() > 6.9) {
						System.out.println("" + alunos.getNome());
					}
				}
				System.out.println("");
				break;

			case 5:
				System.out.println("--- REPROVADOS POR FALTA ---");
				for (Aluno alunos : ingles.getAlunos()) {
					if (alunos.getQtdFaltas() >= 15) {
						System.out.println("Nome : " + alunos.getNome());
						System.out.println("Quantidade de faltas : " + alunos.getQtdFaltas());
					}
				}
				System.out.println("");
				break;

			case 6:
				System.out.println("--- LISTA DE ALUNOS ---");
				for (Aluno alunos : ingles.getAlunos()) {
					System.out.println("" + alunos.getNome());
				}
				System.out.println("");
				break;

			default:
				break;
			}

		} while (opcao != 0);
		leitor.close();
	}

}
