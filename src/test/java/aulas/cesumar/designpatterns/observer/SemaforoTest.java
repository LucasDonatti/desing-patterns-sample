package aulas.cesumar.designpatterns.observer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SemaforoTest {

	@Test
	public void lightChangingNotifyObservers() {
		var semaforo = new Semaforo();
		final boolean[] luzesAcessas = new boolean[3];
		var observer = new MudancaDeLuzObserver() {
			@Override
			public void luzModificada(Semaforo semaforo) {
				luzesAcessas[0] = semaforo.isVermelho();
				luzesAcessas[1] = semaforo.isAmarelo();
				luzesAcessas[2] = semaforo.isVerde();
			}
		};

		semaforo.addObserver(observer);

		assertThat(semaforo.isVermelho()).isTrue();
		assertThat(semaforo.isAmarelo()).isFalse();
		assertThat(semaforo.isVerde()).isFalse();
		assertThat(luzesAcessas).containsExactly(false, false, false);

		semaforo.mudarLuz();
		assertThat(semaforo.isVermelho()).isFalse();
		assertThat(semaforo.isAmarelo()).isFalse();
		assertThat(semaforo.isVerde()).isTrue();
		assertThat(luzesAcessas).containsExactly(false, false, true);

		semaforo.mudarLuz();
		assertThat(semaforo.isVermelho()).isFalse();
		assertThat(semaforo.isAmarelo()).isTrue();
		assertThat(semaforo.isVerde()).isFalse();
		assertThat(luzesAcessas).containsExactly(false, true, false);

		semaforo.mudarLuz();
		assertThat(semaforo.isVermelho()).isTrue();
		assertThat(semaforo.isAmarelo()).isFalse();
		assertThat(semaforo.isVerde()).isFalse();
		assertThat(luzesAcessas).containsExactly(true, false, false);

		semaforo.mudarLuz();
		assertThat(semaforo.isVermelho()).isFalse();
		assertThat(semaforo.isAmarelo()).isFalse();
		assertThat(semaforo.isVerde()).isTrue();
		assertThat(luzesAcessas).containsExactly(false, false, true);
	}

}