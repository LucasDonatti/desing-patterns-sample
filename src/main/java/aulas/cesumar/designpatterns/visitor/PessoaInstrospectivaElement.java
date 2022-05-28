package aulas.cesumar.designpatterns.visitor;

public class PessoaInstrospectivaElement implements PessoaElement {

	@Override
	public void accept(PessoaVisitor visitor) {
		visitor.visit(this);
	}
}
