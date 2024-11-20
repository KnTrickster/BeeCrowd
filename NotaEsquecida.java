import java.util.Scanner;

public class NotaEsquecida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1 = sc.nextInt();
        int media = sc.nextInt();
        int nota2 = media*2 - nota1;
        System.out.println(nota2);
        sc.close();
    }
}
