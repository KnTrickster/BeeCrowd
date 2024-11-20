import java.util.Scanner;

public class RestoDaDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int maior, menor;
        if (x>0 && y>0){
            if (x>y){
                menor = y;
                maior = x;
            }
            else{
                menor = x;
                maior = y;
            }
            for(int i = menor+1; i<maior; i++){
                if (i%5==2 || i%5==3){
                    System.out.println(i);
                }
            }
        } 
        sc.close();   
    }
}
