package aulas.cesumar.designpatterns.observer;

public class VeiculoAutonomo implements MudancaDeLuzObserver {

	private boolean andando;
	private boolean parando;

	public VeiculoAutonomo() {
		parando = true;
	}

	@Override
	public void luzModificada(Semaforo semaforo) {
		andando = semaforo.isVerde();
		parando = semaforo.isVermelho() || semaforo.isAmarelo();
	}

	public boolean isAndando() {
		return andando;
	}

	public boolean isParando() {
		return parando;
	}
}
