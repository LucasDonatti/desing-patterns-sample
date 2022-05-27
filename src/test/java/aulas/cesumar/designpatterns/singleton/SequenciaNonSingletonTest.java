package aulas.cesumar.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SequenciaNonSingletonTest {

	@Test
	public void duasSequenciasIndependentes() {
		SequenciaNonSingleton seq1 = new SequenciaNonSingleton();

		assertThat(seq1.getNextValue()).isEqualTo(1);
		assertThat(seq1.getNextValue()).isEqualTo(2);
		assertThat(seq1.getNextValue()).isEqualTo(3);

		SequenciaNonSingleton seq2 = new SequenciaNonSingleton();
		assertThat(seq2.getNextValue()).isEqualTo(1);
		assertThat(seq2.getNextValue()).isEqualTo(2);
		assertThat(seq2.getNextValue()).isEqualTo(3);
	}

}