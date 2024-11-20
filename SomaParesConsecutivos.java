import java.util.Scanner;

public class SomaParesConsecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = 1, soma = 0;
        while (x!=0){
            x = sc.nextInt();
            if (x!=0){
                for (int i = 0; i<5; i++){
                    if (x%2==0){
                        soma += x;
                        x += 2;
                    }
                    else{
                        x++;
                        if(x%2==0){
                            soma += x;
                            x += 2;
                        }
                    }
                }
                System.out.println(soma);
                soma = 0;
            }    
        }
        sc.close();
    }
}
