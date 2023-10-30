package RedeSocial;
import java.util.ArrayList;

public class RedeSocial {

    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;
    private ArrayList<Publicacao> publicacoes;

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.publicacoes = new ArrayList<Publicacao>(); // Inicializa a lista de publicações
    }


    public void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }

    public void imprimePublicacoes() {
        int totalPublicacoes = publicacoes.size();
        System.out.println("Total de publicações: " + totalPublicacoes);

        System.out.println("Conteúdo das publicações:");
        for (Publicacao publicacao : publicacoes) {
            System.out.println("Data de Publicação: " + publicacao.getDataPublicacao());
            System.out.println("Texto da Publicação: " + publicacao.getTextoPublicacao());
            System.out.println("-------------------");
        }
    }
}
