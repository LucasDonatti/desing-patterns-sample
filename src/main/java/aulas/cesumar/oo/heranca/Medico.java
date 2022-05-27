package aulas.cesumar.oo.heranca;

public class Medico extends Pessoa {
	public String crm;

	public Medico(String nome, String cpf, String crm) {
		super(nome, cpf);
		this.crm = crm;
	}
}
