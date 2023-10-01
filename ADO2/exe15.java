package ADO2;
import java.util.Scanner;

public class exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro (maior que zero):  ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("O número deve ser maior que zero.");
        } else {
            long resultado = 1;

            for (int i = 1; i <= numero; i++) {
                resultado *= i;
            }

            System.out.println("O fatorial do número " + numero + " é: " + resultado);
        }

        scanner.close();
    }
}

