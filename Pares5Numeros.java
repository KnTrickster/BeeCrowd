import java.util.Scanner;

public class Pares5Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par=0;
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                par++;
            }
        }
        System.out.println(par + " valores pares");
        sc.close();
    }
}
