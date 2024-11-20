import java.util.Scanner;
public class Diferenca {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int diff = (a * b - c * d);
        System.out.println("DIFERENCA = " + diff);
        sc.close();
    }
}
