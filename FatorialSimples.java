/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.
 */
import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero==0 || numero==1){
            System.out.println("1");
        }
        else{
            for(int i = numero-1; i>0; i--){
                numero *= i;
            }
            System.out.println(numero);
        }
        sc.close();
    }
}
