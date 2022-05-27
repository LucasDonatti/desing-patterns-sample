package aulas.cesumar.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SequenciaSingletonTest {

	@Test
	public void sequenciaUnica() {
		SequenciaSingleton seq1 = SequenciaSingleton.getInstance();
		SequenciaSingleton seq2 = SequenciaSingleton.getInstance();

		assertThat(seq1.getNextValue()).isEqualTo(1);
		assertThat(seq2.getNextValue()).isEqualTo(2);

		assertThat(seq1.getNextValue()).isEqualTo(3);
		assertThat(seq2.getNextValue()).isEqualTo(4);

		assertThat(seq1.getNextValue()).isEqualTo(5);
		assertThat(seq2.getNextValue()).isEqualTo(6);
	}

}