import java.util.Scanner;

public class RecebeDadosAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a matrícula do aluno:");
        int matricula = scanner.nextInt();
        
        System.out.println("Digite as notas da AV1, AV2 e AE (separadas por espaços):");
        int notaAV1 = scanner.nextInt();
        int notaAV2 = scanner.nextInt();
        int notaAE = scanner.nextInt();

        scanner.nextLine(); // Limpar o buffer
        
        System.out.println("Digite o curso do aluno:");
        String curso = scanner.nextLine();

        System.out.println("Digite o período do aluno:");
        String periodo = scanner.nextLine();

        Aluno aluno = new Aluno(nome, matricula, notaAV1, notaAV2, notaAE, curso, periodo);

        System.out.println("Resultado da avaliação do aluno:");
        System.out.println(aluno.avaliarAluno());

        System.out.println("Resultado da avaliação de recuperação do aluno:");
        System.out.println(aluno.avaliarRecuperacao());

        scanner.close();
    }
}
