package aulas.cesumar.designpatterns.visitor;

public class VerificadorDeCreditoVisitor implements PessoaVisitor {

	private ValidadorDeCredito.Builder validadorBuilder;

	public VerificadorDeCreditoVisitor(ValidadorDeCredito.Builder validadorBuilder) {
		this.validadorBuilder = validadorBuilder;
	}

	@Override
	public void visit(PessoaInstrospectivaElement pessoa) {
		validadorBuilder.withConsultaPorNome(true);
	}

	@Override
	public void visit(PessoaCaloteiraElement pessoa) {
		validadorBuilder.withConsultaPorNome(true).withConsultaPorCPF(true).withConsultaPorCarteiraDeTrabalho(true);
	}

	@Override
	public void visit(PessoaReceptivaElement pessoa) {
		validadorBuilder.withConsultaPorCPF(true);
	}
}
