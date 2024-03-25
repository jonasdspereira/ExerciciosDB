import java.util.Scanner;

public class conversorHoras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = segundos(scanner);

        int h = horas(s);

        int m = minutos(s);

        s = segRestante(s);

        tempo(h,m,s);
    }

    private static int segundos(Scanner scanner) {
        System.out.print("Digite o tempo em segundos: ");
        return scanner.nextInt();
    }

    private static int horas(int s) {
        return s / 3600;
    }

    private static int minutos(int s) {
        return (s % 3600) / 60;
    }

    private static int segRestante(int s) {
        return (s % 3600) % 60;
    }

    private static void tempo(int h, int m, int s) {
        System.out.printf("%dh%dmin%dseg\n", h, m, s);
    }
}
