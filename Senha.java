import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int numero = sc.nextInt();
            int senha = numero - 1;
            System.out.println(senha);
        }
        sc.close();
    }
}
