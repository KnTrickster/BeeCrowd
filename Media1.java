import java.util.Scanner;
public class Media1 {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        double media = ((a*3.5) + (b*7.5)) / 11 ;
        System.out.printf("MEDIA = %.5f\n", media);
        sc.close();
    }
}
