import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        
        if (x%2==0){
            x++;
            for(int i=0; i<6; i++){
            System.out.println(x);
            x+=2;
            }
        }
        else{
            for(int i=0; i<6; i++){
            System.out.println(x);
            x+=2;
            }
        }
        

        sc.close();
    }
}
