import java.util.Scanner;
public class Media2 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double media = (a*2 + b*3 + c*5)/ 10 ;
        System.out.printf("MEDIA = %.1f\n", media);
        sc.close();
    }
}
