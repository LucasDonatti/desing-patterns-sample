package aulas.cesumar.oo.abstracao;

public class ExemploAbstracao {
	public static void main(String[] args) {
		String nome = "João das Neves";
		String cpf = "12345678911";
		Pessoa joaoDaNeves = new Pessoa(nome, cpf);
		Advogado advogado = new Advogado(joaoDaNeves, "14253");
		Medico medico = new Medico(joaoDaNeves, "32479");

		System.out.println(advogado.numeroRegistro());
		System.out.println(medico.numeroRegistro());

		System.out.printf("advogado é Medico? %s\n", Medico.class.isInstance(advogado));
		System.out.printf("medico é Advogado? %s\n", Advogado.class.isInstance(medico));
	}
}
