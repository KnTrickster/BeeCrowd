import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abc[] = sc.nextLine().split(" ");
        double a = Double.parseDouble(abc[0]);
        double b = Double.parseDouble(abc[1]);
        double c = Double.parseDouble(abc[2]);
        double reserva;

        if (b>a && b>c){
            reserva = a;
            a = b;
            b = reserva;
        }
        else if (c>a && c>b){
            reserva = a;
            a = c;
            c = reserva;
        }

        if (a>=b+c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{
            if (a*a==(b*b+c*c)){
                System.out.println("TRIANGULO RETANGULO");
            }
            else if (a*a>(b*b+c*c)){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a==b && a==c){
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if(a==b || a==c || b==c){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();    
    }
}
