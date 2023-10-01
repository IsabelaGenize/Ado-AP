package ADO2;

import java.util.Scanner;


//Faça um programa para ler e escrever dados de uma turma de 5 alunos. O programa deve pedir dados como nome, idade e sexo. O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE.


public class exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;
        char sexoMaisVelho = ' ';
        
        do {
            System.out.println("Dados do Aluno " + contador + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.nextLine().charAt(0);
            
            if (idade > idadeMaisVelho) {
                nomeMaisVelho = nome;
                idadeMaisVelho = idade;
                sexoMaisVelho = sexo;
            }
            
            contador++;
        } while (contador <= 5);
        
        System.out.println("\nDados do Aluno mais velho:");
        System.out.println("Nome: " + nomeMaisVelho);
        System.out.println("Idade: " + idadeMaisVelho);
        System.out.println("Sexo: " + sexoMaisVelho);
        
        scanner.close();
    }
}