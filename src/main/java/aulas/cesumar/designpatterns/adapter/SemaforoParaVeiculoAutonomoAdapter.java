package aulas.cesumar.designpatterns.adapter;

public class SemaforoParaVeiculoAutonomoAdapter implements SemaforoObserver {

	private VeiculoAutonomo veiculoAutonomo;

	public SemaforoParaVeiculoAutonomoAdapter(VeiculoAutonomo veiculoAutonomo) {
		this.veiculoAutonomo = veiculoAutonomo;
	}

	@Override
	public void ficouVermelho() {
		veiculoAutonomo.pare();
	}

	@Override
	public void ficouAmarelo() {
		// faz nada
	}

	@Override
	public void ficouVerde() {
		veiculoAutonomo.ande();
	}
}
