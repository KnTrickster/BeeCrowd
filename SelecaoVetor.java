import java.util.Scanner;
public class SelecaoVetor {
     public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);	
        double numeros [] = new double [3]; 
        for (int i = 0; i <numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] <= 10) {
                System.out.printf("A[" + i + "] = %.1f\n", numeros[i]);
            }
        }
        sc.close();    
    }
}
