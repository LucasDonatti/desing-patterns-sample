package aulas.cesumar.designpatterns.templatemethod;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProfissaoRegulamentadaTest {

	@Test
	public void exibirNomeDeProfissoesDiferentes() {
		String nome = "João das Neves";
		String cpf = "12345678911";
		Pessoa joaoDaNeves = new Pessoa(nome, cpf);
		ProfissaoRegulamentada advogado = new Advogado(joaoDaNeves, "14253");
		ProfissaoRegulamentada medico = new Medico(joaoDaNeves, "32479");

		assertThat(advogado.exibirIdentificacao()).isEqualTo("João das Neves 14253");
		assertThat(medico.exibirIdentificacao()).isEqualTo("João das Neves 32479");
	}
}