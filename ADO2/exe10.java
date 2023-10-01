package ADO2;

//Faça um programa que calcule e imprima o resultado da soma abaixo (lembre-se de que tanto as divisões quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.
// S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/20

public class exe10 {
    public static void main(String[] args) {
        double soma = 0.0;

        for (int i = 1; i <= 20; i++){
            System.out.println(soma += 1.0/i);
            System.out.println();
        }

        System.out.println("O resultado da soma da série é: " + soma);
    }
}
