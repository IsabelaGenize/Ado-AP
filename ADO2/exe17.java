package ADO2;
import java.util.Scanner;

public class exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a seguir um número inteiro:  ");
        int n = scanner.nextInt();

        System.out.println("Os divisores do número " + n + "são: ");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
