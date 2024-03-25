import java.util.Scanner;

public class mediaAluno {

    public static double calculoMedia(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }

    public static String status(double media) {
        if (media >6) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Verificação Suplementar";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("##MÉDIA DO ALUNO##");
        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double n4 = scanner.nextDouble();

        double media = calculoMedia(n1, n2, n3, n4);
        String s = status(media);

        System.out.printf("Média: %.2f\n", media);
        System.out.println(STR."Status: \{s}");
    }
}
