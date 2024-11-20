import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n2 = 11, media = 0;
        double n1 = sc.nextDouble();
        while (n1<0 || n1>10 || n2<0 || n2>10){
            if(n1 >= 0 && n1 <= 10){
                n2 = sc.nextDouble();
                if(n2 >= 0 && n2 <= 10){
                    media = (n1+n2)/2;
                    System.out.println("media = " + media);
                }
                else{
                    System.out.println("nota invalida");
                    n2 = sc.nextDouble();
                    if(n2 >= 0 && n2 <= 10){
                        media = (n1+n2)/2;
                        System.out.println("media = " + media);
                    }
                    else{
                        System.out.println("nota invalida");
                    }
                }
            }
            else{
                System.out.println("nota invalida");
                n1 = sc.nextDouble();
            }
        }
        

        

        sc.close();
    }
}
