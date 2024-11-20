import java.util.Scanner;

public class Resto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        for(int i = 2; i<=10000; i++){
            if (i%divisor==2){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
