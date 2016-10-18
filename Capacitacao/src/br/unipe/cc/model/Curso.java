package br.unipe.cc.model;

import java.util.Set;
import java.util.TreeSet;

public class Curso {

	private Professor professor;
	private Set<Aluno> alunos = new TreeSet<>();
	private String nome;
	private int numeroId;

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno a) {
		alunos.add(a);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}

}
