package ADO2;

//Faça um programa que gere a seguinte série: 10, 20, 30, 40, ..., 990, 1000. Use o laço FOR.

public class exe4 {
    public static void main(String[] args) {
        for (int i = 10; i <= 1000; i += 10) {
            System.out.print(i);
            if (i < 1000) {
                System.out.print(", ");
            }
        }
    }
}