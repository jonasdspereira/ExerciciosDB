import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("##Calculadora##");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
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
                soma();
                break;
            case 2:
                subtracao();
                break;
            case 3:
                multiplicacao();
                break;
            case 4:
                divisao();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private static void soma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        double resultado = n1 + n2;
        System.out.println(STR."A soma de \{n1} + \{n2} é: \{resultado}");
    }

    public static void subtracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        double resultado = n1 - n2;
        System.out.println(STR."A subtração de \{n1} - \{n2} é: \{resultado}");
    }

    public static void multiplicacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        double resultado = n1 * n2;
        System.out.println(STR."A multiplicação de \{n1} * \{n2} é: \{resultado}");
    }

    public static void divisao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        if (n2 == 0) {
            System.out.println("Divisão por zero não é permitida.");
        } else {
            double resultado = n1 / n2;
            System.out.println(STR."Resultado da divisão: \{resultado}");
        }
    }

}
