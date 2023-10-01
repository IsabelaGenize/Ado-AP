package ADO2;

import java.util.Scanner;

//Escreva um programa que leia um conjunto de 10 números inteiros positivos. Seu Programa deve determinar e imprimir o maior deles. Use o laço FOR


public class exe3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int maior = Integer.MIN_VALUE;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = entrada.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
        }
        
        System.out.println("O maior número digitado é: " + maior);
        
        entrada.close();
    }
}