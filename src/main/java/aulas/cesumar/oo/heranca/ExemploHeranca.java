package aulas.cesumar.oo.heranca;

public class ExemploHeranca {
	public static void main(String[] args) {
		String nome = "João das Neves";
		String cpf = "12345678911";
		Pessoa joaoDaNeves = new Pessoa(nome, cpf);
		joaoDaNeves = new Advogado(nome, cpf, "14253");
		Pessoa joaoDaNevesMedico = new Medico(nome, cpf, "32479");
	}
}
