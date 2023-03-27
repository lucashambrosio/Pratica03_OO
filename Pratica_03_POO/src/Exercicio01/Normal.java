package Exercicio01;

public class Normal extends Ingresso {

    public Normal(double valor) {
        super(valor);
    }

    public void imprimirValor() {
        System.out.println("Ingresso normal - Valor: R$" + getValor());
    }
}
