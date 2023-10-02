package ADO2;

import java.util.Scanner;

//Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.
// S = 1 + 2/3 + 4/5 + 6/7 + ... + 2n/(2n + 1)

public class exe14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = entrada.nextInt();

        double soma = 0.0;

        for (int i = 1; i <= n; i++){
            soma += (double)(2*i) / (2*i+1);
        }

        System.out.println("O resultado da soma da série é: " + soma);
    }
}
