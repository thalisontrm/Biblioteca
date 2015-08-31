package com.thalisontrm;

import java.util.Date;

public class Reserva {
	private Usuario usuarios;
	private Livro livros;
	private Date data_emprestimo;

	public Usuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public Livro getLivros() {
		return livros;
	}

	public void setLivros(Livro livros) {
		this.livros = livros;
	}

	public Date getData_emprestimo() {
		return data_emprestimo;
	}

	public void setData_emprestimo(Date data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}

}
