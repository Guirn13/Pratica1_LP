package exercicio_2;

public class Pessoa {

    private String nome;

    private String email;

    private String telefone;

    public Pessoa(String nome, String email, String telefone) {
        nome = nome;
        email = email;
        telefone = telefone;
    }

    public String getnome() {
        return nome;
    }

    public String getemail() {
        return email;
    }

    public String gettelefone() {
        return telefone;
    }

    public void setnome(String nome) {
        nome = nome;
    }

    public void setemail(String email) {
        email = email;
    }

    public void settelefone(String telefone) {
        telefone = telefone;
    }
}
