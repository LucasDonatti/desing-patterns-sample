package aulas.cesumar.designpatterns.singleton;

public class SequenciaSingleton {

	private static SequenciaSingleton instance;
	private int value = 0;

	public static SequenciaSingleton getInstance() {
		if (instance == null) {
			instance = new SequenciaSingleton();
		}
		return instance;
	}

	private SequenciaSingleton() {}

	public int getNextValue() {
		return ++value;
	}

}
