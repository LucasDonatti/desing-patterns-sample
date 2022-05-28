package aulas.cesumar.designpatterns.adapter;

public class VeiculoAutonomo {

	private boolean andando;
	private boolean parando;

	private SemaforoParaVeiculoAutonomoAdapter semaforoAdapter;

	public VeiculoAutonomo() {
		parando = true;
		semaforoAdapter = new SemaforoParaVeiculoAutonomoAdapter(this);
	}

	public boolean isAndando() {
		return andando;
	}

	public boolean isParando() {
		return parando;
	}

	public SemaforoParaVeiculoAutonomoAdapter getSemaforoAdapter() {
		return semaforoAdapter;
	}

	public void pare() {
		parando = true;
		andando = false;
	}

	public void ande() {
		parando = false;
		andando = true;
	}
}
