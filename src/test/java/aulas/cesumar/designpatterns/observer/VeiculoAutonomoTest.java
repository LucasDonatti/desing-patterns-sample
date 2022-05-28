package aulas.cesumar.designpatterns.observer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VeiculoAutonomoTest {

	@Test
	public void answerToLightChanging() {
		VeiculoAutonomo veiculoAutonomo = new VeiculoAutonomo();
		Semaforo semaforo = new Semaforo();
		semaforo.addObserver(veiculoAutonomo);

		assertThat(semaforo.isVermelho()).isTrue();
		assertThat(veiculoAutonomo.isParando()).isTrue();
		assertThat(veiculoAutonomo.isAndando()).isFalse();

		semaforo.mudarLuz();
		assertThat(semaforo.isVerde()).isTrue();
		assertThat(veiculoAutonomo.isParando()).isFalse();
		assertThat(veiculoAutonomo.isAndando()).isTrue();

		semaforo.mudarLuz();
		assertThat(semaforo.isAmarelo()).isTrue();
		assertThat(veiculoAutonomo.isParando()).isTrue();
		assertThat(veiculoAutonomo.isAndando()).isFalse();

		semaforo.mudarLuz();
		assertThat(semaforo.isVermelho()).isTrue();
		assertThat(veiculoAutonomo.isParando()).isTrue();
		assertThat(veiculoAutonomo.isAndando()).isFalse();
	}
}