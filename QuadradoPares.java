import java.util.Scanner;

public class QuadradoPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int n = sc.nextInt();
        for (int i = 2; i<=n; i+=2) {
            a = i*i;
            System.out.println(i+"^2 = " + a);
        }
        sc.close();
    }
}
