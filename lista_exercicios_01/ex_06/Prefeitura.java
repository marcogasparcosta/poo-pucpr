import java.util.Scanner;

public class Prefeitura {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o salário bruto: ");
        double salario = leitor.nextDouble();

        System.out.print("Informe o valor da prestação: ");
        double pretacao = leitor.nextDouble();

        if ((salario * 0.3) >= pretacao) {
            System.out.println("Empréstimo pode ser concedido");
        } else {
            System.out.println("Empréstimo não pode ser concedido");
        }
    }
}