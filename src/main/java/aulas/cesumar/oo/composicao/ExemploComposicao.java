package aulas.cesumar.oo.composicao;

public class ExemploComposicao {
	public static void main(String[] args) {
		String nome = "João das Neves";
		String cpf = "12345678911";
		Pessoa joaoDaNeves = new Pessoa(nome, cpf);
		Advogado advogado = new Advogado(joaoDaNeves, "14253");
		Medico medico = new Medico(joaoDaNeves, "32479");
	}
}
