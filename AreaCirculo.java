import java.util.Scanner;
//Apresentar a mensagem "A=" seguido pelo valor da variável area
public class AreaCirculo {
    public static void main(String[] args) {
        double area, n = 3.14159;
        Scanner sc = new Scanner (System.in);
        
        double raio = sc.nextDouble();
        area = n*raio*raio;
        System.out.printf("A=%.4f\n", area);
        sc.close();
    }
}