package aulas.cesumar.designpatterns.builder.simples;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LivroTest {

	@Test
	public void createABook() {
		Livro.Builder builder = Livro.builder();
		Livro livro = builder
				.withEditora("Cia das Letras")
				.withRegistro("IBSN 883282723")
				.withMaterial("Papel Simples capa comum")
				.withTexto("um-dia-feliz-em-agosto.txt")
				.build();

		Livro.BuilderHollow builderHollow = Livro.builderHollow();
		builderHollow.withEditora("Cia das Letras");
		builderHollow.withRegistro("IBSN 883282723");
		builderHollow.withMaterial("Papel Simples capa comum");
		builderHollow.withTexto("um-dia-feliz-em-agosto.txt");
		Livro outroLivro = builderHollow.build();

		assertThat(livro.getEditora()).isEqualTo("Cia das Letras");
		assertThat(livro.getRegistro()).isEqualTo("IBSN 883282723");
		assertThat(livro.getMaterial()).isEqualTo("Papel Simples capa comum");
		assertThat(livro.getTexto()).isEqualTo("um-dia-feliz-em-agosto.txt");
		assertThat(livro.getCapa()).isEqualTo("cor-amarela");

		assertThat(livro).isEqualTo(outroLivro);
	}

	@Test
	public void onlyCreateABBookWithAllInformation() {
		Livro.Builder builder = Livro.builder();

		Livro livro = builder.withEditora("Cia das Letras").build();
		assertThat(livro).isNull();

		livro = builder.withRegistro("IBSN 883282723").build();
		assertThat(livro).isNull();

		livro = builder.withMaterial("Papel Simples capa comum").build();
		assertThat(livro).isNull();

		livro = builder.withTexto("um-dia-feliz-em-agosto.txt").build();
		assertThat(livro).isNotNull();
	}
}