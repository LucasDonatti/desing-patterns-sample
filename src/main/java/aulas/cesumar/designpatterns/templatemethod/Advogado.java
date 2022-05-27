package aulas.cesumar.designpatterns.templatemethod;

public class Advogado extends ProfissaoRegulamentada {

	public Pessoa pessoa;
	public String oab;

	public Advogado(Pessoa pessoa, String oab) {
		this.pessoa = pessoa;
		this.oab = oab;
	}

	@Override
	protected String nome() {
		return pessoa.nome;
	}

	@Override
	public String numeroRegistro() {
		return oab;
	}
}
