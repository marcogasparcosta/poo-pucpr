import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o salário: ");
        double salario = leitor.nextDouble();

        System.out.print("Informe o aumento (%): ");
        double aumento = leitor.nextDouble();

        System.out.println("Aumento do salário = "
                + (salario * (aumento / 100)));
        System.out.println("Novo salário = "
                + (salario + (salario * (aumento / 100))));
    }
}