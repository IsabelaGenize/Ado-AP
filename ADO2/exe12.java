package ADO2;

import java.util.Scanner;

//Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente
// S = 1/n + 2/n-1 + 3/n-2 + ... + n-1/2 + n/1

public class exe12{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número natural n: ");
        int n = entrada.nextInt();

        double soma = 0.0;

        for (int i = 1; i <= n; i++){
            soma += (double) i/(n - i + 1);
        }

        System.out.println("O resultado da soma da série é: " + soma);
    }
}