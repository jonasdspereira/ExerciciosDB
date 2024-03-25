import java.util.InputMismatchException;
import java.util.Scanner;

public class outraCalculadora {

    public static double soma(double n1, double n2) {
        return n1 + n2;
    }
    private static double subtracao(double n1, double n2) {
        return n1 - n2;
    }
    private static double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }
    private static double divisao(double n1, double n2) {
        return n1 / n2;
    }
    private static double potenciacao(double n1, double n2) {
        return Math.pow(n1, n2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("##Calculadora##");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Potenciação");
        System.out.println("0. Sair");

        int opcao;
        while (true) {
            try {
                System.out.println("Digite a opção desejada");
                opcao = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Digite um número entre 0 e 4.");
                scanner.nextLine();
            }
        }

        switch (opcao) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                double n1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double n2 = scanner.nextDouble();

                double resultadoSom = outraCalculadora.soma(n1,n2);
                System.out.println(STR."A soma de \{n1} + \{n2} é: \{resultadoSom}");
                break;
            case 2:
                System.out.print("Digite o primeiro número: ");
                n1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                n2 = scanner.nextDouble();

                double resultadoSub = outraCalculadora.subtracao(n1,n2);
                System.out.println(STR."A subtração de \{n1} - \{n2} é: \{resultadoSub}");
                break;
            case 3:
                System.out.print("Digite o primeiro número: ");
                n1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                n2 = scanner.nextDouble();

                double resultadoMult = outraCalculadora.multiplicacao(n1,n2);
                System.out.println(STR."A subtração de \{n1} * \{n2} é: \{resultadoMult}");
                break;
            case 4:
                System.out.print("Digite o primeiro número: ");
                n1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                n2 = scanner.nextDouble();

                if (n2 == 0) {
                    System.out.println("Divisão por zero não é permitida.");
                } else {
                    double resultadoDiv = outraCalculadora.divisao(n1,n2);
                    System.out.println(STR."Resultado da divisão: \{resultadoDiv}");
                }
                break;
            case 5:
                System.out.print("Digite o primeiro número: ");
                n1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                n2 = scanner.nextDouble();

                double resultadoPot = outraCalculadora.potenciacao(n1, n2);
                System.out.printf("Potenciação: %.2f\n", resultadoPot);
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
