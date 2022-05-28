package aulas.cesumar.designpatterns.observer;

import java.util.HashSet;
import java.util.Set;

public class Semaforo {

	private boolean vermelho;
	private boolean amarelo;
	private boolean verde;

	private final Set<MudancaDeLuzObserver> observers;

	public Semaforo() {
		vermelho = true;
		observers = new HashSet<>();
	}

	public boolean isVermelho() {
		return vermelho;
	}

	public boolean isAmarelo() {
		return amarelo;
	}

	public boolean isVerde() {
		return verde;
	}

	public void addObserver(MudancaDeLuzObserver observer) {
		observers.add(observer);
	}

	public void removerObserver(MudancaDeLuzObserver observer) {
		observers.remove(observer);
	}

	public void mudarLuz() {
		ligarLuzCorreta();
		notificarObservers();
	}

	private void ligarLuzCorreta() {
		if (vermelho) {
			vermelho = false;
			amarelo = false;
			verde = true;
			return;
		}

		if (amarelo) {
			vermelho = true;
			amarelo = false;
			verde = false;
			return;
		}

		if (verde) {
			vermelho = false;
			amarelo = true;
			verde = false;
		}
	}

	private void notificarObservers() {
		observers.forEach(it -> it.luzModificada(this));
	}

}
