package aulas.cesumar.designpatterns.visitor;

public class ValidadorDeCredito {

	private boolean consultaPorNome;
	private boolean consultaPorCPF;
	private boolean consultaPorCarteiraDeTrabalho;

	private ValidadorDeCredito(boolean consultaPorNome, boolean consultaPorCPF, boolean consultaPorCarteiraDeTrabalho) {
		this.consultaPorNome = consultaPorNome;
		this.consultaPorCPF = consultaPorCPF;
		this.consultaPorCarteiraDeTrabalho = consultaPorCarteiraDeTrabalho;
	}

	public static Builder builder() {
		return new Builder();
	}

	public boolean isConsultaPorNome() {
		return consultaPorNome;
	}

	public boolean isConsultaPorCPF() {
		return consultaPorCPF;
	}

	public boolean isConsultaPorCarteiraDeTrabalho() {
		return consultaPorCarteiraDeTrabalho;
	}

	public static class Builder {
		private boolean consultaPorNome;
		private boolean consultaPorCPF;
		private boolean consultaPorCarteiraDeTrabalho;

		public Builder withConsultaPorNome(boolean consultaPorNome) {
			this.consultaPorNome = consultaPorNome;
			return this;
		}

		public Builder withConsultaPorCPF(boolean consultaPorCPF) {
			this.consultaPorCPF = consultaPorCPF;
			return this;
		}

		public Builder withConsultaPorCarteiraDeTrabalho(boolean consultaPorCarteiraDeTrabalho) {
			this.consultaPorCarteiraDeTrabalho = consultaPorCarteiraDeTrabalho;
			return this;
		}

		public ValidadorDeCredito build() {
			return new ValidadorDeCredito(consultaPorNome, consultaPorCPF, consultaPorCarteiraDeTrabalho);
		}
	}
}
