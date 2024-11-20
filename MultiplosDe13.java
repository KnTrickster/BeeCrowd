import java.util.Scanner;

public class MultiplosDe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int menor, maior, soma = 0;
        if (x>y){
            menor = y;
            maior = x;
        }
        else{
            menor = x;
            maior = y;
        }
        for(int i = menor; i<=maior; i++){
            if (i%13!=0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
