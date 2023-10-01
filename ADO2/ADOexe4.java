package ADO2;
    import java.util.Scanner;

public class ADOexe4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contagem = 0;
        double somaP = 0;
        int quantP = 0;

        while (contagem < 6) {
            System.out.print("Digite um número: ");
            double valor = entrada.nextDouble();

            if (valor > 0) {
                somaP += valor;
                quantP++;
            }

            contagem++;
        }

        if (quantP > 0) {
            double MPositivos = somaP / quantP;
            System.out.println("Soma dos valores positivos: " + somaP);
            System.out.println("Quantidade de valores positivos: " + quantP);
            System.out.println("Média dos valores positivos: " + MPositivos);
        } else {
            System.out.println("Nenhum valor que seja positivo foi digitado, tente novamente!");
        }

        entrada.close();
    }
}


