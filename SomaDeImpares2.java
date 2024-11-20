import java.util.Scanner;
public class SomaDeImpares2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor, maior, soma = 0;
        int testes = sc.nextInt();
        sc.nextLine();
        for (int a = 0; a<testes; a++){
            String xy [] = sc.nextLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
                
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
            soma = 0;
        }
        sc.close();
    }
}

