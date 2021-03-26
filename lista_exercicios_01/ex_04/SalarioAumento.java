import java.util.Scanner;

public class SalarioAumento {

    static String encerrar = "";

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);

        do {
            System.out.print("Informe o salário: ");
            double salario = leitor.nextDouble();

            if (salario < 500) {
                System.out.println("Salário reajustado: " + (salario * 1.2));
            } else {
                System.out.println("Este salário não tem direito a reajuste");
            }

            System.out.println("Deseja encerrar digite [fim] ou enter para continuar: ");
            encerrar = leitor2.nextLine();

        } while (!encerrar.equals("fim"));
    }
}