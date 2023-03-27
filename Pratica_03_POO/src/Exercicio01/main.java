package Exercicio01;

import java.util.Scanner;

public class main {
    public void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de ingresso:");
        System.out.println("1 - Ingresso Normal:");
        System.out.println("2 - Ingresso VIP:");
        System.out.println("Ingresso Camarote:");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                Normal normal = new Normal (50.0);
                normal.imprimirValor();
                break;


            case 2:
                System.out.println("Digite o valor adicional do ingresso VIP:");
                double adicional = scanner.nextDouble();
                VIP vip = new VIP(70.0,adicional);
                vip.imprimirValor();
                break;

            case 3:
                System.out.println("Digite o valor adicional do ingresso Camarote:");
                adicional = scanner.nextDouble();
                System.out.println("Digite a localização do Camarote:");
                scanner.nextLine();
                String localizacao = scanner.nextLine();
                Camarote camarote = new Camarote(100.0,adicional,localizacao);
                camarote.imprimirValor();
                break;

            default:
                System.out.println("Opção Inválida");
                break;

        }


    }
}
