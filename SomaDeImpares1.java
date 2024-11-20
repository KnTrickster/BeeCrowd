import java.util.Scanner;
public class SomaDeImpares1 {
    
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
        for(int i = menor+1; i<maior; i++){
            if (i%2!=0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}


