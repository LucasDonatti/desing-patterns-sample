package aulas.cesumar.oo.encapsulamento;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PessoaIdealEncapsulamento {

	private static final int MAIORIDADE_BRASILEIRA = 18;

	private String nome;
	private LocalDateTime dataNascimento;
	private String cnh;

	public PessoaIdealEncapsulamento(String nome, LocalDateTime dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public String getCnh() {
		return cnh;
	}

	public void registrarCnh(String cnh) {
		if (isMenorDeIdade()) {
			throw new RuntimeException("Muito novo para ter carteira de motorista.");
		}
		this.cnh = cnh;
	}

	public void atualizarDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
		if (isMenorDeIdade()) {
			cnh = null;
		}
	}
	private boolean isMenorDeIdade() {
		return ChronoUnit.YEARS.between(dataNascimento, LocalDateTime.now()) < MAIORIDADE_BRASILEIRA;
	}

	@Override
	public String toString() {
		return "Pessoa{" +
				"name='" + nome + '\'' +
				", dataNascimento=" + dataNascimento +
				", cnh='" + cnh + '\'' +
				'}';
	}
}
