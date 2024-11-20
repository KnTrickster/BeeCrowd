import java.util.Scanner;

public class TesteDeSelecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String valores[] = sc.nextLine().split(" ");
        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);
        int d = Integer.parseInt(valores[3]);

        if (b>c && d>a && c+d>a+b && c>=0 && d>=0 && a%2==0) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
        sc.close();
    }
}
