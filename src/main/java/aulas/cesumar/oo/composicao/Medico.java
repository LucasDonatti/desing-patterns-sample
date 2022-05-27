package aulas.cesumar.oo.composicao;

public class Medico {

	public Pessoa pessoa;
	public String crm;

	public Medico(Pessoa pessoa, String crm) {
		this.pessoa = pessoa;
		this.crm = crm;
	}
}
