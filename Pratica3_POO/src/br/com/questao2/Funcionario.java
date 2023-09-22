package br.com.questao2;

public abstract class Funcionario {
    private int matricula;
    private String Nome;

    private double Salario;

    public Funcionario(int matricula, String nome, double salario) {
        this.matricula = matricula;
        Nome = nome;
        Salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return Nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public double calcularProventos(){
        return getSalario();
    }

    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Matricula: " + getMatricula()+ "\n" +
                "Salário: "+getSalario();
    }

}
