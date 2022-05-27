package aulas.cesumar.oo.polimorfismo;

public class ExemploPolimorfismo {
	public static void main(String[] args) {
		String nome = "João das Neves";
		String cpf = "12345678911";
		Pessoa joaoDaNeves = new Pessoa(nome, cpf);
		Advogado advogado = new Advogado(joaoDaNeves, "14253");
		Medico medico = new Medico(joaoDaNeves, "32479");
//		ProfissaoRegulamentada advogado = new Advogado(joaoDaNeves, "14253");
//		ProfissaoRegulamentada medico = new Medico(joaoDaNeves, "32479");

		imprimirNumeroRegistro(advogado);
		imprimirNumeroRegistro(medico);

		System.out.printf("advogado é Medico? %s\n", Medico.class.isInstance(advogado));
		System.out.printf("medico é Advogado? %s\n", Advogado.class.isInstance(medico));
		System.out.printf("advogado é ProfissaoRegulamentada? %s\n", ProfissaoRegulamentada.class.isInstance(advogado));
		System.out.printf("medico é ProfissaoRegulamentada? %s\n", ProfissaoRegulamentada.class.isInstance(medico));
	}

	private static void imprimirNumeroRegistro(ProfissaoRegulamentada profissao) {
		System.out.println(profissao.numeroRegistro());
	}
}
