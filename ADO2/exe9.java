package ADO2;

import java.util.Scanner;

//Escreva um programa para ler a quantidade de alunos existentes em uma turma. Depois disso, o programa deve ler as notas de cada um destes alunos, calcular e mostrar na tela a média aritmética destas notas. Utilize o laço WHILE.

public class exe9 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos na turma: ");
        int quant = entrada.nextInt();

        int calculo = 0;
        double soma = 0;

        while (calculo < quant) {
            System.out.println("Digite a nota do aluno " + (calculo + 1) + ": ");
            double nota = entrada.nextDouble();
            soma += nota;
            calculo++;
        }

        if (quant > 0) {
            double media = soma/quant;
            System.out.println("A média das notas dos " + quant + " alunos é: " + media);
        }
        else{
            System.out.println("Não há alunos na turma");
        }
    }
}
