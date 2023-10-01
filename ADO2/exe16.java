package ADO2;

import java.util.Scanner;

public class exe16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva a quantidade de números inteiros a serem lidos:  ");
        int n = scanner.nextInt();

        int add = 0;

        do {
            System.out.print("Digite o próximo número inteiro:  ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("NULO");
            } else {
                if (numero % 2 == 0) {
                    System.out.print("PAR ");
                } else {
                    System.out.print("ÍMPAR ");
                }

                if (numero > 0) {
                    System.out.println("POSITIVO");
                } else {
                    System.out.println("NEGATIVO");
                }
            }

            add++;
        } while (add < n);

        scanner.close();
    }
}
