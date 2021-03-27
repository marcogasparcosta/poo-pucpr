import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int aprovado = 0;
        int reprovado = 0;
        int exame = 0;
        double mediaTotal = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Informe a primeira nota: ");
            double nota1 = leitor.nextDouble();
            System.out.print("Informe a segunda nota: ");
            double nota2 = leitor.nextDouble();

            double media = (nota1 + nota2) / 2;
            mediaTotal = mediaTotal + media;

            if (media >= 7) {
                System.out.println("Média = " + media + " - Aprovado");
                aprovado++;
            }

            if (media < 7 && media > 3) {
                System.out.println("Média = " + media + " - Exame");
                exame++;
            }

            if (media <= 3) {
                System.out.println("Média = " + media + " - Reprovado");
                reprovado++;
            }
        }
        System.out.println("Total de alunos aprovados = " + aprovado);
        System.out.println("Total de alunos de exame = " + exame);
        System.out.println("Total de alunos reprovados = " + reprovado);
        System.out.println("Média da sala = " + mediaTotal/6);
    }
}
