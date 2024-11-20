import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // soma ímpar = 0 || soma par = 1
        int linhas = sc.nextInt();
        int coluna = sc.nextInt();
        sc.close();
        if ((linhas + coluna) % 2 == 0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
