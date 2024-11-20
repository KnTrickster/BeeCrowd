import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeros[] = sc.nextLine().split(" ");
        int a = Integer.parseInt(numeros[0]);
        int b = Integer.parseInt(numeros[1]);

        if (a%b==0 || b%a==0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }
        sc.close();
    }
}
