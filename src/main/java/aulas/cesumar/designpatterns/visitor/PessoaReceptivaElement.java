package aulas.cesumar.designpatterns.visitor;

public class PessoaReceptivaElement implements PessoaElement {

	@Override
	public void accept(PessoaVisitor visitor) {
		visitor.visit(this);
	}
}
