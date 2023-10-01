package ADO2;
import java.util.Scanner;

public class ADOexe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a seguir um número inteiro: ");
        int x = scanner.nextInt();

        System.out.println("Os Números ímpares de 1 até " + x + " são: ");

        for (int i = 1; i <= x; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}

