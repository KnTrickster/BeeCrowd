import java.util.Scanner;
public class ProdutoEasy {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("PROD = " + (a*b) + "\n");
        sc.close();
    }
}
