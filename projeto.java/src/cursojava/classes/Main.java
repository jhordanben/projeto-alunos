package cursojava.classes;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.Scanner;

import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.excecao.ExcecaoProcessarNota; 


public class Main {

        public static void main(String[] args) {
        	
        	//try {
        		//lerArquivo();
        	
        		
        	
        	//File fil = new File("c://lines.txt");
        	//Scanner scanner = new Scanner(fil);
        		
        	
        	
        	String login = JOptionPane.showInputDialog("Informe o login");
        	String senha = JOptionPane.showInputDialog("Informe a senha");
        		
        	                	        	
        	if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

            List<Aluno> alunos = new ArrayList<Aluno>();
            
                
            HashMap<String, List <Aluno>> maps = new HashMap<String, List <Aluno>>();
            
            
            for (int qtd = 1; qtd <= 10; qtd++) {

            /*new Aluno() é uma instancia - criaçao de objetos*/
            /*aluno 1 é uma referencia para o objeto ALUNO*/


            	/*String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+ "?" );
            String DataMatricula = JOptionPane.showInputDialog("Qual DataMatricula do aluno?");*/
            String idade = JOptionPane.showInputDialog("Qual Idade do aluno?");
            /*String NomeEscola = JOptionPane.showInputDialog("Qual o NomeEscola do aluno?");
            String NomeMae = JOptionPane.showInputDialog("Qual o NomeMae do aluno?");
            String NomePai = JOptionPane.showInputDialog("Qual o NomePai do aluno?"); */


            Aluno aluno1 = new Aluno();
            /*aluno1.setNome(nome); */
            /*aluno1.setDataMatricula(DataMatricula);*/
            aluno1.setIdade(Integer.valueOf(idade));
            /*aluno1.setNomeEscola(NomeEscola);
            aluno1.setNomePai(NomePai);
            aluno1.setNomeMae(NomeMae); */


            for (int pos = 1; pos <= 4; pos++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "");
                String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(notaDisciplina);
                disciplina.setNota(Double.valueOf(notaDisciplina));

                aluno1.getDisciplinas().add(disciplina);
            }

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

            if (escolha == 0) {

                int continuarRemover = 0;
                int posicao = 1;

                while (continuarRemover == 0) {

                    String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
                    aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                    posicao++;
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar remover?");
                }

            }
            
            Object mapsObject;
            
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			
			for (Aluno aluno : alunos) {
				
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
			}
            
			System.out.println("----------------- LISTA DOS APROVADOS -------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());
			}
			
			System.out.println("----------------- LISTA DE RECUPERACAO -------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());
			}
			
			System.out.println("----------------- LISTA DOS REPROVADOS -------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());
			}
            
            
                alunos.add(aluno1);

                for (int pos = 0; pos < alunos.size(); pos ++) {

                    Aluno aluno = alunos.get(pos);

                    if (aluno.getNome().equalsIgnoreCase("victor")) {

                        Aluno trocar = new Aluno();
                        trocar.setNome("O Aluno foi trocado");

                        Disciplina disciplina = new Disciplina();
                        disciplina.setDisciplina("Matematica");
                        disciplina.setNota(96);

                        trocar.getDisciplinas().add(disciplina);

                        alunos.set(pos, trocar);


                }

            }


        }


       Aluno aluno2 = new Aluno();


       Aluno aluno3 = new Aluno();

       Aluno aluno4 = new Aluno("Diego");

       Aluno aluno5 = new Aluno("Diego", 17);


        /*System.out.println(aluno.toString());
        System.out.println("Média do aluno = " + aluno.getMediaNota()); */
       /* System.out.println("Resultado = " + aluno1.getAlunoAprovado()); */


        }else {
    	  JOptionPane.showMessageDialog(null, "acesso negado");
        	
       }
    
        	
        /*}catch (Exception e) {
        	
        	StringBuilder saida = new StringBuilder();
        	
        	e.printStackTrace();
        	
        	System.out.println("Mensagem " + e.getMessage());
        	
        	for (int pos = 0; pos < e.getStackTrace().length; pos++) {
        		
        		saida.append("\n Classe de erro" + e.getStackTrace()[pos].getClassName());
        		saida.append("\n Método de erro" + e.getStackTrace()[pos].getMethodName());
        		saida.append("\n Linha de erro" + e.getStackTrace()[pos].getLineNumber());
        		saida.append("\n Class" + e.getClass().getName()); */
        		
        	}
        
        }
   }
        
        	
        	//JOptionPane.showMessageDialog(null, "Erro de conversão de numero" + saida.toString());
        //}catch (NullPointerException e) {
        	//JOptionPane.showMessageDialog(null, "opa um null exception" + e.getClass());
        //} catch (ExcecaoProcessarNota e) {
        	//e.printStackTrace();
        	//JOptionPane.showMessageDialog(null, "Obrigado");
        	
        	
        	
        	
 /*}finally {
	 JOptionPane.showMessageDialog(null, "aaaaaaaaaaaaaaa");
 	}
 
       
 /}
        public static void lerArquivo () throws ExcecaoProcessarNota {
        	try {
        		File fil = new File("c://lines.txt");
        		Scanner scanner = new Scanner(fil);
        		
        	} catch (FileNotFoundException e) {
        		throw new ExcecaoProcessarNota(e.getMessage());
        	}
        }
} */
 
        


