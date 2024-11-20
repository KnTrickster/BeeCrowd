import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testes = sc.nextInt();
        for (int i = 0; i<testes; i++){
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }
        sc.close();
    }
}
