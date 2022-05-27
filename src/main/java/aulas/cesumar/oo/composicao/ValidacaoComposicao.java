package aulas.cesumar.oo.composicao;

public class ValidacaoComposicao {
	public static void main(String[] args) {
		String nome = "João das Neves";
		String cpf = "12345678911";
		Pessoa joaoDaNeves = new Pessoa(nome, cpf);
		Advogado advogado = new Advogado(joaoDaNeves, "14253");
		Medico medico = new Medico(joaoDaNeves, "32479");

		System.out.println("==============================================================");
		System.out.printf("joaoDaNeves == advogado? %s\n", joaoDaNeves.equals(advogado));
		System.out.printf("joaoDaNeves == medico? %s\n", joaoDaNeves.equals(medico));
		System.out.println("==============================================================");
		System.out.printf("joaoDaNeves é Pessoa? %s\n", Pessoa.class.isInstance(joaoDaNeves));
		System.out.printf("advogado é Pessoa? %s\n", Pessoa.class.isInstance(advogado));
		System.out.printf("medico é Pessoa? %s\n", Pessoa.class.isInstance(medico));
		System.out.println("==============================================================");
		System.out.printf("medico.pessoa é joaoDasNeves? %s\n", medico.pessoa.equals(joaoDaNeves));
		System.out.printf("advogado.pessoa é joaoDasNeves? %s\n", advogado.pessoa.equals(joaoDaNeves));
		System.out.println("==============================================================");
	}
}
