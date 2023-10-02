package ADO2;

import java.util.Scanner;

//Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.
// S = 1 + (1*2)/(1*3) + (1*2*3)/(1*3*5) + (1*2*3*4) + (1*3*5*7) + ... + (1*2*3*...*n)/1*3*5*...*(2n - 1)

public class exe13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = entrada.nextInt();

        double soma = 0.0;
        double conta = 1.0;

        for(int i = 1; i <= n; i++){
            double numero = 1.0;
            for(int j = 1; j <= i; j++){
                numero *= j;
            }

            soma += numero / conta;
            conta *= (2 * i + 1);
        }

        System.out.println("O resultado da soma da série é: " + soma);
    }
}
