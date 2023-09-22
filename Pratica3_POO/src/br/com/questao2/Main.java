package br.com.questao2;

public class Main {
    public static void main(String[] args) {

        Padrao p = new Padrao(1, "Guilherme",1000);
        System.out.println(p.toString());

        Fcomissionario fc = new Fcomissionario(2,"Thales",1200,2,10000);
        System.out.println(fc.toString());

        FProdutividade fp = new FProdutividade(3,"leo",650,0.5,100);
        System.out.println(fp.toString());

    }
}
