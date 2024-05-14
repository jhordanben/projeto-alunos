package cursojava.classes;

/*classe filha*/
/*essa é a classe/objeto que representa o aluno*/

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    /*Esses sao os atributos dos alunos*/
    
    public String dataMatricula;
    public String nomeEscola;
    public String serieMatriculado;
    public String sexo;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas  = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Aluno() { /*Cria dados na memoria - padrao do java*/

    }

    public Aluno (String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno (String nomePadrao, int idadePadrao) {
        super.nome = nomePadrao;
        idade = idadePadrao;

    }


    private double nota1;
    private String disciplina1;
    private double nota2;
    private String disciplina2;
    private double nota3;
    private String disciplina3;
    private double nota4;
    private String disciplina4;


    /*metodo que retorna a media do aluno*/

    public double getMediaNota() {

        double somaNotas = 0.0;

        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getMediaNota();
        }

        return somaNotas / disciplinas.size();

    }

    /*public boolean getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media >= 50) {
            if (media >= 70) {
                return "Aluno está aprovado";
        } else {
                return "Aluno está em recuperação";
            }

        } else {
            return "Aluno foi reprovado";
        }
    } */
    
    public String getAlunoAprovado2() {
        double media = this.getMediaNota();
        if (media >= 50) {
            if (media >= 70) {
                return StatusAluno.APROVADO;
        } else {
                return StatusAluno.RECUPERACAO;
            }

        } else {
            return StatusAluno.REPROVADO;
        }
    }
    
    

    /*==========================================================*/



    /*veremos os metodos SETTERS E GETTERS do objeto*/
    /*SET é para adicionar ou receber dados do atributo*/
    /*GET é para resgatar ou obter o valor do atributo*/

    /*Recebe dados, metodo SET*/
    

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", sexo='" + sexo + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                '}';
    }
    
    @Override /*identifica metodo sobreescrito*/
    public boolean pessoaMaiorIdade() {
    	
    	return idade >= 21;
    }
    
    public String msgMaiorIdade() {
    	return this.pessoaMaiorIdade() ? "VOCE É MAIOR DE IDADE" : "VOCE É DE MENOR";
    }
    
    public double salario() {
		return (1800 * 80) / 4;
	}
}
