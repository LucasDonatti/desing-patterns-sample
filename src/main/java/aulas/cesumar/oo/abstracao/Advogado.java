package aulas.cesumar.oo.abstracao;

public class Advogado implements ProfissaoRegulamentada {

	public Pessoa pessoa;
	public String oab;

	public Advogado(Pessoa pessoa, String oab) {
		this.pessoa = pessoa;
		this.oab = oab;
	}

	@Override
	public String numeroRegistro() {
		return oab;
	}
}
