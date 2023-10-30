package exercicio_2;

public class Funcionario extends Pessoa{


    private String departameto;

    private double salario;

    private String dtaEntrada;

    private String rg;

    private boolean ativo;

    public Funcionario(String nome, String email, String telefone, String departameto, double salario, String dtaEntrada, String rg, boolean ativo) {
        super(nome, email, telefone);
        this.departameto = departameto;
        this.salario = salario;
        this.dtaEntrada = dtaEntrada;
        this.rg = rg;
        this.ativo = ativo;
    }

    public String getDepartameto() {
        return departameto;
    }

    public void setDepartameto(String departameto) {
        this.departameto = departameto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDtaEntrada() {
        return dtaEntrada;
    }

    public void setDtaEntrada(String dtaEntrada) {
        this.dtaEntrada = dtaEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
