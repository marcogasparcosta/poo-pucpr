import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um número inteiro: ");
            int num = leitor.nextInt();
            if (num % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }
        }
    }
}
