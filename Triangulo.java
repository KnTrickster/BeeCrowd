import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String valores[] = sc.nextLine().split(" ");
        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        double c = Double.parseDouble(valores[2]);

        //Caso Triângulo
        if (a>b-c && a<b+c) {
            double tri = a+b+c;
            System.out.printf("Perimetro = %.1f\n", tri); 
        }
        //Caso Trapézio
        else {
            double trap = (a+b)*c/2;
            System.out.printf("Area = %.1f\n", trap);
        }

        sc.close();
    }
}
