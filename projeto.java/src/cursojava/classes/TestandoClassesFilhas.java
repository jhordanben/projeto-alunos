package cursojava.classes;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno ();
		aluno.setNome("jhordan");
		aluno.setIdade(24);
		
		
		Diretor diretor = new Diretor ();
		diretor.setNome("marcelo");
		diretor.setIdade(51);
		
		
		Secretario secretario = new Secretario ();
		secretario.setNome("tia ana");
		secretario.setIdade(21);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + "-" + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println(" Salário Aluno é = " + aluno.salario());
		System.out.println(" Salário Diretor é = " + diretor.salario());
		System.out.println(" Salário Secretário é = " + secretario.salario());
		
	}

}
