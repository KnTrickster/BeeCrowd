import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double x = 0, sentinel = 0, media = 0;
        
        while (x>=0){
            x = sc.nextDouble();
            if(x>=0){
                sentinel++;
                media += x;
            }
        }
        media/=sentinel;
        System.out.printf("%.2f\n",media);
        sc.close();
    }
}
