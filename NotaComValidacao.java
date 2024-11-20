import java.util.Scanner;

public class NotaComValidacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media, n1, n2=11, teste = 1;
        while(teste!=2){
            if (teste == 1){
                n1 = sc.nextDouble();
                while (n1<0 || n1>10 || n2<0 || n2>10){
                    if(n1 >= 0 && n1 <= 10){
                        n2 = sc.nextDouble();
                        if(n2 >= 0 && n2 <= 10){
                            media = (n1+n2)/2;
                            System.out.printf("media = %.2f\n", media);
                        }
                        else{
                            System.out.println("nota invalida");
                            n2 = sc.nextDouble();
                            if(n2 >= 0 && n2 <= 10){
                                media = (n1+n2)/2;
                                System.out.printf("media = %.2f\n", media);
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
            }
            n2 = 11;
            teste = 0;
            while(teste!=1 && teste!=2){
                System.out.println("novo calculo (1-sim 2-nao)");
                teste = sc.nextDouble();
            } 
        }
        sc.close();
    }
}
