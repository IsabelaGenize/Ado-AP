package ADO2;

import java.util.Scanner;

public class exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o saldo inicial da sua conta:  ");
        double saldo = scanner.nextDouble();

        int Opcao;
        double ValorFinal;

        do {
            System.out.println("\nOpções:");
            System.out.println("1. Realizar um depósito");
            System.out.println("2. Realizar um saque");
            System.out.println("3. Sair");
            System.out.print("Digite a opção que deseja realizar:  ");
            Opcao = scanner.nextInt();

            switch (Opcao) {
                case 1:
                    System.out.print("Digite o valor que deseja depositar: ");
                    ValorFinal = scanner.nextDouble();
                    saldo += ValorFinal;
                    System.out.println("Depósito de R$" + ValorFinal + " feito com sucesso! Seu saldo atual é de: R$" + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor que deseja sacar: ");
                    ValorFinal = scanner.nextDouble();
                    if (ValorFinal >= saldo) {
                    saldo -= ValorFinal;
                    System.out.println("Saque de R$" + ValorFinal + "  feito com sucesso! Saldo atual é de: R$" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida; Por favor tente novamente!");
            }
        } while (Opcao != 3);

        if (saldo == 0) {
            System.out.println("CONTA ZERADA");
        } else if (saldo < 0) {
            System.out.println("CONTA ESTOURADA");
        } else {
            System.out.println("CONTA PREFERENCIAL");
        }

        scanner.close();
    }
}
