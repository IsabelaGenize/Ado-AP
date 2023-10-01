package ADO2;

import java.util.Scanner;

//Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.

public class exe11 {
    
    public static void main(String[] args) {
        double soma = 0.0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número acima de 5: ");
        int n = entrada.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(soma += 1.0/i);
            System.out.println();
        }

        System.out.println("O resultado da soma da série é: " + soma);
    }
}
