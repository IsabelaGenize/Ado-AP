package ADO2;
//Faça um programa que mostre os números pares entre 1 e 100, inclusive. Use o laço while.//
public class ADOexe1 {
    public static void main(String[] args) {
        int numero = 1;

        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}

