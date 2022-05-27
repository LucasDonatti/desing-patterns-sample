package aulas.cesumar.designpatterns.templatemethod;

public class Medico extends ProfissaoRegulamentada {

	public Pessoa pessoa;
	public String crm;

	public Medico(Pessoa pessoa, String crm) {
		this.pessoa = pessoa;
		this.crm = crm;
	}

	@Override
	protected String nome() {
		return pessoa.nome;
	}

	@Override
	public String numeroRegistro() {
		return crm;
	}
}
