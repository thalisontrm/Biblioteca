package com.thalisontrm;

public class Pessoa {

		private Long id;
		private String nome;
		private String endereco;
		private double telefone;
		private double cpf;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public double getTelefone() {
			return telefone;
		}
		public void setTelefone(double telefone) {
			this.telefone = telefone;
		}
		public double getCpf() {
			return cpf;
		}
		public void setCpf(double cpf) {
			this.cpf = cpf;
		}
				
}
