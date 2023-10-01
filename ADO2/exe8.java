package ADO2;

//Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73. Utilize o laço que lhe for mais conveniente

public class exe8 {
    
    public static void main(String[] args) {
        
        int soma = 0;
        int calculo = 0;

        for (int numero = 14; numero <= 72; numero += 2){
            soma += numero;
            calculo++;
        }

        if (calculo > 0){
            double media = (double) soma/calculo;
            System.out.println("A média dos números pares entre 13 e 73 é: " + media);

        }
        else {
            System.out.println("Não há números pares entre 13 e 73. ");
        }
    }
}
