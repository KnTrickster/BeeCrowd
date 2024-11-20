import java.util.Scanner;

public class SequenciaNumsSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior, menor, soma = 0, x = 1, y = 1;
        while (x>0 && y>0){
            String xy [] = sc.nextLine().split(" ");
            x = Integer.parseInt(xy[0]);
            y = Integer.parseInt(xy[1]);
            if (x>0 && y>0){
                if (x>y){
                    menor = y;
                    maior = x;
                }
                else{
                    menor = x;
                    maior = y;
                }
                for(int i = menor; i<=maior; i++){
                    System.out.print(i + " ");
                    soma += i;
                }
                System.out.print("Sum=" + soma + "\n");
                soma = 0;  
                } 
            }
        sc.close();
    }
}
