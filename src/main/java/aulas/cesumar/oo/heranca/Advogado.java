package aulas.cesumar.oo.heranca;

public class Advogado extends Pessoa {
	public String oab;

	public Advogado(String nome, String cpf, String oab) {
		super(nome, cpf);
		this.oab = oab;
	}
}
