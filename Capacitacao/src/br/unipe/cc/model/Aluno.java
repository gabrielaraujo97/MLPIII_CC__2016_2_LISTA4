package br.unipe.cc.model;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private String matricula;
	private double media;
	private int qtdFaltas;

	public int compareTo(Aluno a) {
		return this.nome.compareTo(a.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getQtdFaltas() {
		return qtdFaltas;
	}

	public void setQtdFaltas(int qtdFaltas) {
		this.qtdFaltas = qtdFaltas;
	}

}
