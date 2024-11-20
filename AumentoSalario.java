import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double salario = sc.nextDouble();
        double newsalary, reajuste;
        int percent;
        if (salario >= 0 && salario<=400.00){
            reajuste = salario*0.15;
            newsalary = salario + reajuste;
            percent = 15;
        }
        else if (salario >= 400.01 && salario<=800.00){
            reajuste = salario*0.12;
            newsalary = salario + reajuste;
            percent = 12;
        }
        else if (salario >= 800.01 && salario<=1200.00){
            reajuste = salario*0.10;
            newsalary = salario + reajuste;
            percent = 10;
        }
        else if (salario >= 1200.01 && salario<=2000.00){
            reajuste = salario*0.07;
            newsalary = salario + reajuste;
            percent = 7;
        }
        else {
            reajuste = salario*0.04;
            newsalary = salario + reajuste;
            percent = 4;
        }
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", newsalary, reajuste, percent);
        sc.close();
    }
}
