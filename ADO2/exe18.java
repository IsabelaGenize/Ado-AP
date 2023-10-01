package ADO2;
import java.util.Scanner;

public class exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a seguir um número inteiro, (lembrando que o número inteiro deve ser menor que 46): ");
        int n = scanner.nextInt();

        if (n < 1 || n >= 46) {
            System.out.println("O número deve estar entre 1 e 45, por favor tente novamente!");
        } else {
            System.out.println("Na Série de Fibonacci os " + n + " primeiros números são: ");

            int primeironumero = 0;
            int segundonumero = 1;
            System.out.print(primeironumero + " " + segundonumero + " ");

            for (int i = 2; i < n; i++) {
                int proximo = primeironumero + segundonumero;
                System.out.print(proximo + " ");
                primeironumero = segundonumero;
                segundonumero = proximo;
            }
        }

        scanner.close();
    }
}

