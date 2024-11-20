import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for (int i = 1; i<11; i++) {
            int multiplos = numero*i;
            System.out.println(i + " x " + numero + " = " + multiplos);
        }
        sc.close();
    }
}
