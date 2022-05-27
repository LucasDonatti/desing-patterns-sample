package aulas.cesumar.designpatterns.templatemethod;

public abstract class ProfissaoRegulamentada {

	public String exibirIdentificacao() {
		return String.format("%s %s", nome(), numeroRegistro());
	}

	protected abstract String nome();
	protected abstract String numeroRegistro();
}
