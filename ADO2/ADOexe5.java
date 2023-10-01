package ADO2;
import java.util.Scanner;
//Leia um valor inteiro N do usuário, onde N é maior ou igual a 2 e menor ou igual a 1000.
//A seguir, usando o laço DO-WHILE, mostre a tabuada de N no seguinte formato:
//1 x N = N 2 x N = 2N ... 10 x N = 10N

public class ADOexe5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        
        do {
            System.out.print("Digite a seguir um valor inteiro (lembre-se que deve ser um número entre 2 e 1000): ");
            numero = entrada.nextInt();
        } while (numero < 2 || numero > 1000);

        int i = 1;

        do {
            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
            i++;
        } while (i <= 10);

        entrada.close();
    }
}
