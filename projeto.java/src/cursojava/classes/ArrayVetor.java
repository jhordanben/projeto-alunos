package cursojava.classes;

import java.lang.reflect.Array;

public class ArrayVetor {

	public static void main(String[] args) {
		
		
		double [] notasMatematica = {9.3, 8.8, 6.8, 9.7};
		double [] notasPortugues = {5.3, 9.8, 9.8, 6.7};
		double [] notasCiencias = {6.6, 8.3, 7.2, 9.0};
		double [] notasIngles = {9.1, 4.8, 10.0, 9.7};
		
		
		//criação do aluno
		Aluno aluno = new Aluno ();
		aluno.setNome("Jhordan");
		aluno.setNomeEscola("Serrano");
		
		//criação da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Matematica");
		disciplina.setNota(notasMatematica);	
		
		aluno.getDisciplinas().add(disciplina);
		
		//===================================================================
				
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Portugues");
		disciplina2.setNota(notasPortugues);
		
		aluno.getDisciplinas().add(disciplina2);
		//===================================================================
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Ciencias");
		disciplina3.setNota(notasCiencias);
		
		aluno.getDisciplinas().add(disciplina3);
		//===================================================================
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Ingles");
		disciplina4.setNota(notasIngles);
		
		aluno.getDisciplinas().add(disciplina4);
				
		//------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			
			System.out.println("Nome do aluno é " + arrayAlunos[pos].getNome());
			
			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
			System.out.println("Nome da disciplina é" + d.getDisciplina());
			
			for (int posnota = 0; posnota < d.getNota().length; posnota++) {
				System.out.println("A nota numero " + posnota + "é igual = " + d.getNota()[posnota]);
			}
			
		}	
		}

	}
}