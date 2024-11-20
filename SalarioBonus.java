import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //String nomeSemUso = sc.nextLine();
        double fixo = sc.nextDouble();
        double vendas = sc.nextDouble();
        double salario = fixo + vendas*0.15;
        System.out.printf("TOTAL = R$ %.2f\n", salario);
        sc.close();
    }
}
