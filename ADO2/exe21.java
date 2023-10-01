package ADO2;
import java.util.Scanner;

public class exe21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a seguir um número inteiro: ");
        int numero = entrada.nextInt();

        int somadivisor = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somadivisor += i;
            }
        }

        if (somadivisor == numero) {
            System.out.println("O " + numero + " é um número perfeito");
        } else {
            System.out.println("O " + numero + " não é um número perfeito");
        }

        entrada.close();
    }
}

