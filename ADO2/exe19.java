package ADO2;
import java.util.Scanner;

public class exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 2002;
        
        while (true) {
            System.out.print("Por favor, digite a senha: ");
            int senhacolocada = scanner.nextInt();
            
            if (senhacolocada == senhaCorreta) {
                System.out.println("Acesso Permitido");
                break; 
            } else {
                System.out.println("Senha Inválida");
            }
        }
        
        scanner.close();
    }
}

