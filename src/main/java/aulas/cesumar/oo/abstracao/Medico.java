package aulas.cesumar.oo.abstracao;

public class Medico implements ProfissaoRegulamentada {

	public Pessoa pessoa;
	public String crm;

	public Medico(Pessoa pessoa, String crm) {
		this.pessoa = pessoa;
		this.crm = crm;
	}

	@Override
	public String numeroRegistro() {
		return crm;
	}
}
