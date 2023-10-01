package ADO2;
    import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número que seja natural: ");
        int n = scanner.nextInt();
        
        double soma = 0.0;
        
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }
        
        System.out.println("A soma é: " + soma);
        
        scanner.close();
    }
}


