package aulas.cesumar.designpatterns.visitor;

public interface PessoaVisitor {
	void visit(PessoaInstrospectivaElement pessoa);

	void visit(PessoaCaloteiraElement pessoa);

	void visit(PessoaReceptivaElement pessoa);
}
