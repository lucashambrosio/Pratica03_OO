package Exercicio01;

public class VIP extends Ingresso {

    private double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public void imprimirValor () {
        double valorTotal = getValor() + adicional;
        System.out.println("INgresso VIP - Valor: R$" + valorTotal);
    }
}
