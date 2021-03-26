import java.util.Scanner;

public class PostoGasolina {
    public static void main(String[] args) {

        final double VALOR_REFRI = 3.0;
        final double VALOR_GASOLINA = 2.5;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a quantidade de litros de gasolina: ");
        double litrosGasolina = leitor.nextDouble();

        System.out.print("Informe a quantidade de refrigerantes: ");
        int quantRefri = leitor.nextInt();

        double valorTotal = (litrosGasolina * VALOR_GASOLINA) + (quantRefri * VALOR_REFRI);

        System.out.println("Valor total: " + valorTotal);
    }
}
