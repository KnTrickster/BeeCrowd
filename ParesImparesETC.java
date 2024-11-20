import java.util.Scanner;

public class ParesImparesETC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares=0, impares=0, positivos=0, negativos=0;
        
        for (int i=0; i<5; i++) {
            int numero = sc.nextInt();
            if(numero%2==0){
                pares++;
            }
            else{
                impares++;
            }
            if(numero>0){
                positivos++;
            }
            if(numero<0){
                negativos++;
            }
        }
        System.out.println(pares+" valor(es) par(es)");
        System.out.println(impares+" valor(es) impar(es)");
        System.out.println(positivos+" valor(es) positivo(s)");
        System.out.println(negativos+" valor(es) negativo(s)");

        sc.close();
    }
}