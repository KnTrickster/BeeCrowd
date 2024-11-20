import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
              a = i % 2;
              if (a != 0){
                System.out.println(i);
              }
        }
    

        sc.close();
    }
}
