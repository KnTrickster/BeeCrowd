import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {
        int numeros[] = new int [5];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Os numeros digitados foram: " + numeros[i]);
        }
        sc.close();
    }
}
