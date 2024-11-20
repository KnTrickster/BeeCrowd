import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dist = sc.nextDouble();
        double combust = sc.nextDouble();
        double consumo = dist / combust; 
        System.out.printf("%.3f km/l\n", consumo);
        
        sc.close();
    }
}
