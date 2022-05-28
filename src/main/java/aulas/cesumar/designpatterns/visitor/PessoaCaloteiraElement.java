package aulas.cesumar.designpatterns.visitor;

public class PessoaCaloteiraElement implements PessoaElement {
	@Override
	public void accept(PessoaVisitor visitor) {
		visitor.visit(this);
	}
}
