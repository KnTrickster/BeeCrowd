import java.util.Scanner;
public class NumerosPositivos {
    public static void main(String[] args) {
        int positivos = 0;
        double n[] = new double [6];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<6; i++) {
            n[i] = sc.nextDouble();
            if (n[i]>0) {
                positivos++;
            }
        }
        System.out.println(positivos + " valores positivos");
        sc.close();
    }
}
