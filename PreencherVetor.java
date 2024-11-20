import java.util.Scanner;

public class PreencherVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double n[] = new double[100];
        n[0] = x;
        for (int i = 1; i <n.length; i++) {
            n[i] = n[i - 1]/2; 
        }
        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[" + i + "] = %.4f\n", n[i]);
        }
        sc.close();
    }
}
