package br.com.model;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	private String cep;
	private String logradouro;
	private int numero;
	private String cidade;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nCEP: " + getCep());
		sb.append("\nLogradouro: " + getLogradouro());
		sb.append("\nNúmero: " + getNumero());
		sb.append("\nCidade: " + getCidade());
		return sb.toString();
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
