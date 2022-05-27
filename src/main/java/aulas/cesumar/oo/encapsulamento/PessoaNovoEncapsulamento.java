package aulas.cesumar.oo.encapsulamento;

import java.time.LocalDateTime;

public class PessoaNovoEncapsulamento {
	public String nome;
	public LocalDateTime dataNascimento;
	public String cnh;

	public PessoaNovoEncapsulamento(String nome, LocalDateTime dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa{" +
				"nome='" + nome + '\'' +
				", dataNascimento=" + dataNascimento +
				", cnh='" + cnh + '\'' +
				'}';
	}
}
