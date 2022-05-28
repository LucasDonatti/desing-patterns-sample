package aulas.cesumar.designpatterns.visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VerificadorDeCreditoVisitorTest {

	private ValidadorDeCredito.Builder builder;
	private VerificadorDeCreditoVisitor visitor;

	@BeforeEach
	public void setUp() {
		builder = ValidadorDeCredito.builder();
		visitor = new VerificadorDeCreditoVisitor(builder);
	}

	@Test
	void visitPessoaIntrospectiva() {
//		PessoaInstrospectivaElement pessoa = new PessoaInstrospectivaElement();
		var pessoa = new PessoaInstrospectivaElement();
		pessoa.accept(visitor);

		ValidadorDeCredito validadorDeCredito = builder.build();
		assertThat(validadorDeCredito.isConsultaPorNome()).isTrue();
		assertThat(validadorDeCredito.isConsultaPorCarteiraDeTrabalho()).isFalse();
		assertThat(validadorDeCredito.isConsultaPorCPF()).isFalse();
	}

	@Test
	void visitPessoaCaloteira() {
		var pessoa = new PessoaCaloteiraElement();
		pessoa.accept(visitor);

		ValidadorDeCredito validadorDeCredito = builder.build();
		assertThat(validadorDeCredito.isConsultaPorNome()).isTrue();
		assertThat(validadorDeCredito.isConsultaPorCarteiraDeTrabalho()).isTrue();
		assertThat(validadorDeCredito.isConsultaPorCPF()).isTrue();
	}

	@Test
	void visitPessoaReceptiva() {
		var pessoa = new PessoaReceptivaElement();
		pessoa.accept(visitor);

		ValidadorDeCredito validadorDeCredito = builder.build();
		assertThat(validadorDeCredito.isConsultaPorNome()).isFalse();
		assertThat(validadorDeCredito.isConsultaPorCarteiraDeTrabalho()).isFalse();
		assertThat(validadorDeCredito.isConsultaPorCPF()).isTrue();
	}
}