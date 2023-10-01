package ADO2;
import java.util.Scanner;

public class ADOexe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        
        do {
            System.out.print("Digite a seguir um valor inteiro (lembre-se que deve ser um número entre 2 e 1000): ");
            n = scanner.nextInt();
        } while (n < 2 || n > 1000);

        int i = 1;

        do {
            int resultado = n * i;
            System.out.println(n + " X " + i + " = " + resultado);
            i++;
        } while (i <= 10);

        scanner.close();
    }
}
