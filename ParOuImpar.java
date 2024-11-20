import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testes = sc.nextInt();
        for(int i = 0; i<testes; i++){
            int valor = sc.nextInt();
            //par, impar, positivo, negativo
            if (valor == 0){
                System.out.println("NULL");
            }
            else if(valor % 2 == 0){
                System.out.print("EVEN ");
            }
            else if (valor % 2 != 0){
                System.out.print("ODD ");
            }
            if (valor>0){
                System.out.print("POSITIVE\n");
            }
            else if (valor<0){
                System.out.print("NEGATIVE\n");
            }
        }
        sc.close();
    }
}
