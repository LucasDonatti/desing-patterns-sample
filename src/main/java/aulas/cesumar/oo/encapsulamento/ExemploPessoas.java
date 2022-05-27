package aulas.cesumar.oo.encapsulamento;

import java.time.LocalDateTime;
import java.time.Month;

public class ExemploPessoas {

	public static void main(String[] args) {
		String nome = "John Wick";
		LocalDateTime dataOriginal = LocalDateTime.of(1981, Month.AUGUST, 15, 22, 10);
		PessoaPadraoEncapsulamento p1 = new PessoaPadraoEncapsulamento(nome, dataOriginal);

		LocalDateTime dataNova = LocalDateTime.of(1985, Month.AUGUST, 15, 22, 10);
		p1.setDataNascimento(dataNova);
//		System.out.println(p1);

		String cnh = "12365465489";
		p1.setCnh(cnh);
		System.out.println(p1);

		PessoaNovoEncapsulamento p2 = new PessoaNovoEncapsulamento(nome, dataOriginal);
		p2.dataNascimento = dataNova;
//		System.out.println(p2);

		p2.cnh = cnh;
		System.out.println(p2);

		PessoaPadraoEncapsulamento adolescente1 = new PessoaPadraoEncapsulamento(
				nome,
				LocalDateTime.of(2005, Month.AUGUST, 15, 22, 10)
		);


		try {
			adolescente1.setCnh(cnh);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(adolescente1);

		adolescente1.setDataNascimento(
			LocalDateTime.of(2000, Month.AUGUST, 15, 22, 10)
		);
		adolescente1.setCnh(cnh);
		System.out.println(adolescente1);
		adolescente1.setDataNascimento(
			LocalDateTime.of(2005, Month.AUGUST, 15, 22, 10)
		);

		System.out.println(adolescente1);

	}
}
