import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dados[] = sc.nextLine().split(" ");

        double d1 = Double.parseDouble(dados[0]);
        double d2 = Double.parseDouble(dados[1]);
        double d3 = Double.parseDouble(dados[2]);

        //Triangulo
        double triangulo = d1*d3/2;
        //Circulo
        double circulo = d3*d3*3.14159;
        //Trapezio
        double trapezio = (d1+d2)*d3/2 ;
        //Quadrado
        double quadrado = d2*d2;
        //Retangulo
        double retangulo = d1*d2;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        sc.close();
    }
}
