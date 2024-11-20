import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double volume, pi, raio;
        pi = 3.14159;
        raio = sc.nextDouble();
        raio = raio*raio*raio;
        volume = 4.0/3 * pi * raio;

        System.out.printf("VOLUME = %.3f\n", volume);
        sc.close();
    }
}
