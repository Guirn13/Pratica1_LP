package exercicio_2;

public class Empresa {
    private String nome;
    private String cnpj;
    private int qtde_de_funcionario;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int qtde_de_funcionario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtde_de_funcionario = qtde_de_funcionario;
        this.funcionarios = new Funcionario[100];
    }


}
