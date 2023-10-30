package RedeSocial;

import RedeSocial.Publicacao;
import RedeSocial.RedeSocial;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados da Rede Social:");
        System.out.print("Nome de Usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        LocalDate dataCriacao = LocalDate.now();

        RedeSocial redeSocial = new RedeSocial(dataCriacao.toString(), nomeUsuario, dataNascimento, senha);

        System.out.println("\nInforme os dados das Publicações:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Publicação " + (i + 1));
            String dataPublicacao = LocalDate.now().toString();
            System.out.print("Texto da Publicação: ");
            String textoPublicacao = scanner.nextLine();
            System.out.print("Link de Mídia: ");
            String linkMidia = scanner.nextLine();

            Publicacao publicacao = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);

            redeSocial.inserePublicacao(publicacao);
        }

        redeSocial.imprimePublicacoes();
    }
}
