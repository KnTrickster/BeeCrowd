import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        double litros, horas, velocidadeMedia;
        Scanner sc = new Scanner(System.in);
        horas = sc.nextDouble();
        velocidadeMedia = sc.nextDouble();

        litros = velocidadeMedia/12 * horas;
        System.out.printf("%.3f\n", litros);
        sc.close();
    }
}
