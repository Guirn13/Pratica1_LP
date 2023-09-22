package br.com.carnaval;

public class Main {
    public static void main(String[] args) {

        Normal n1 = new Normal(100);
        n1.imprimeIngreso();

        Vip v1 = new Vip(100, 20);
        v1.imprimeIngressoVip();

        Camarote c1 = new Camarote(100, 100, "ARENA MRV");
        c1.imprimeIngressoVip();

    }
}