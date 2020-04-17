package ex_5_1;

import java.io.Serializable;

public class Funcionario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private int idade;
	private String profissão;
	
	
	public Funcionario(String nome, int idade, String profissão) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.profissão = profissão;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getProfissão() {
		return profissão;
	}


	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}


	@Override
	public String toString() {
	       return new StringBuffer(" Nome: ").append(this.nome)
	                .append(" Idade: ").append(this.idade).append(" Profissao: ").append(this.profissão).toString();
	}
}