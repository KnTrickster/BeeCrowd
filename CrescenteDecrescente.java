import java.util.Scanner;

public class CrescenteDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0, y=1;
        
        while (x!=y){
            String xy [] = sc.nextLine().split(" ");
            x = Integer.parseInt(xy[0]);
            y = Integer.parseInt(xy[1]);
            if(x>y){
                System.out.println("Decrescente");
            }
            else if(y>x){
                System.out.println("Crescente");
            }
        }    
        sc.close();
    }
}
