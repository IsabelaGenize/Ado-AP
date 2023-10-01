package ADO2;
import java.util.Scanner;
//Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso. Use o laço for//
public class ADOexe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a seguir um número inteiro: ");
        int x = entrada.nextInt();

        System.out.println("Os Números ímpares de 1 até " + x + " são: ");

        for (int i = 1; i <= x; i += 2) {
            System.out.println(i);
        }

        entrada.close();
    }
}

