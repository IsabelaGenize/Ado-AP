package ADO2;

import java.util.Scanner;

public class exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite aqui o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        int opcao;
        double dinheiro;

        do {
            System.out.println("\nOpções:");
            System.out.println("1. Realizar um depósito");
            System.out.println("2. Realizar um saque");
            System.out.println("3. Sair");
            System.out.print("Escolha a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor que deseja depositar: ");
                    dinheiro = scanner.nextDouble();
                    saldo += dinheiro;
                    System.out.println("Depósito de R$" + dinheiro + " foi feito com sucesso. Seu saldo atual é de:  R$" + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    dinheiro = scanner.nextDouble();
                    if (dinheiro <= saldo) {
                        saldo -= dinheiro;
                        System.out.println("Saque de R$" + dinheiro + " feito com sucesso. Seu saldo atual é de:  R$" + saldo);
                    } else {
                        System.out.println("Seu saldo é insuficiente para realizar a operação.");
                    }
                    break;
                case 3:
                    System.out.println("Operação encerrada, obrigada!");
                    break;
                default:
                    System.out.println("Opção inválida, por favor tente novamente!");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
