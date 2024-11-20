import java.util.Scanner;
import java.util.Arrays;
public class SortSimples {
    public static void main(String[] args) {
        /*Leia 3 valores inteiros e ordene-os em ordem crescente. 
        No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.*/
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        int numeros [] = new int[3];   
        numeros[0] = n1;
        numeros[1] = n2;
        numeros[2] = n3; 
        //o seguinte comando organiza em ordem crescente ou alfabética        
        Arrays.sort(numeros);
         //exibição de valores em ordem crescente   
        for (int i = 0; i< numeros.length; i++) {
                
            System.out.println(numeros[i]);
        }
        //print dos valores digitados pelos usuário
		System.out.println("\n" + n1 + "\n" + n2 + "\n" + n3);
        sc.close();
    }
}