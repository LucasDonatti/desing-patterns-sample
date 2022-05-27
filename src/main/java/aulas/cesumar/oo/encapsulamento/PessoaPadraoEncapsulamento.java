package aulas.cesumar.oo.encapsulamento;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PessoaPadraoEncapsulamento {

	private static final int MAIORIDADE_BRASILEIRA = 18;

	private String nome;
	private LocalDateTime dataNascimento;
	private String cnh;

	public PessoaPadraoEncapsulamento(String nome, LocalDateTime dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
		if (isMenorDeIdade()) {
			cnh = null;
		}
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		if (isMenorDeIdade()) {
			throw new RuntimeException("Muito novo para ter carteira de motorista.");
		}
		this.cnh = cnh;
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
