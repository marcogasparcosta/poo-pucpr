import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Tabuada - Informe um número inteiro: ");
        int num = leitor.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
