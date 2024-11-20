import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        int n, horas;
        double rem;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        horas = sc.nextInt();
        rem = sc.nextDouble();
        double dinheiro = horas * rem;
        System.out.println("NUMBER = " + n);
        System.out.printf("SALARY = U$ %.2f\n", dinheiro);
        sc.close();
    }
}
