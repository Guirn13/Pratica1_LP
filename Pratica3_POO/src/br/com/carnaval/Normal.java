package br.com.carnaval;

public class Normal extends Ingresso{

    public Normal(double valorIngresso){
        super(valorIngresso);
    }

    public void imprimeIngreso(){
        System.out.println("Ingresso normal - valor:" + getValorIngresso());
    }


}
