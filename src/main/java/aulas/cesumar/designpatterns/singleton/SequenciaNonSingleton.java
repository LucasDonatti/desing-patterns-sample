package aulas.cesumar.designpatterns.singleton;

public class SequenciaNonSingleton {

	private int value = 0;

	public int getNextValue() {
		return ++value;
	}
}
