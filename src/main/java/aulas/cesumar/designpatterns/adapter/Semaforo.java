package aulas.cesumar.designpatterns.adapter;

import java.util.HashSet;
import java.util.Set;

public class Semaforo {

	private boolean vermelho;
	private boolean amarelo;
	private boolean verde;

	private final Set<SemaforoObserver> observers;

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

	public void addObserver(SemaforoObserver observer) {
		observers.add(observer);
	}

	public void removerObserver(SemaforoObserver observer) {
		observers.remove(observer);
	}

	public void mudarLuz() {
		if (vermelho) {
			vermelho = false;
			amarelo = false;
			verde = true;

			observers.forEach(SemaforoObserver::ficouVerde);
			return;
		}

		if (amarelo) {
			vermelho = true;
			amarelo = false;
			verde = false;

			observers.forEach(SemaforoObserver::ficouVermelho);
			return;
		}

		if (verde) {
			vermelho = false;
			amarelo = true;
			verde = false;

			observers.forEach(SemaforoObserver::ficouAmarelo);
		}
	}

}
