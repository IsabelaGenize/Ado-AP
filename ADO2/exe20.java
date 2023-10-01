package ADO2;

import java.util.Scanner;

public class exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o saldo inicial
        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        int opcao;
        double valor;

        do {
            // Exibir opções ao usuário
            System.out.println("\nOpções:");
            System.out.println("1. Realizar depósito");
            System.out.println("2. Realizar saque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Realizar depósito
                    System.out.print("Digite o valor do depósito: ");
                    valor = scanner.nextDouble();
                    saldo += valor;
                    System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
                    break;
                case 2:
                    // Realizar saque
                    System.out.print("Digite o valor do saque: ");
                    valor = scanner.nextDouble();
                    if (valor <= saldo) {
                        saldo -= valor;
                        System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    }
                    break;
                case 0:
                    // Sair do programa
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
