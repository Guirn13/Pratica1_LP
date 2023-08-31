import java.util.Date;

public class Aluno {

    private String nome;
    private int matricula;
    private int notaAV1;
    private int notaAV2;
    private int notaAE;

    private String curso;

    private String Periodo;


    public Aluno(String nome, int matricula, int notaAV1, int notaAV2, int notaAE, String curso, String periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAE = notaAE;
        this.curso = curso;
        this.periodo = periodo;
    }



}
