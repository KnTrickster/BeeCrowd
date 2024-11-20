
import java.util.Scanner;

public class NotasMoedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinheiro = sc.nextDouble();
        double cem=0, cinquenta=0, vinte=0, dez=0, cinco=0, dois=0, um=0, cent50=0, cent25=0, cent10=0, cent5=0, cent1=0;
        if (dinheiro >= 0) {
            cem = Math.floor(dinheiro/100);
            dinheiro = dinheiro%100;
            cinquenta = Math.floor(dinheiro/50);
            dinheiro = dinheiro%50;
            vinte = Math.floor(dinheiro/20);
            dinheiro = dinheiro%20;
            dez = Math.floor(dinheiro/10);
            dinheiro = dinheiro%10;
            cinco = Math.floor(dinheiro/5);
            dinheiro = dinheiro%5;
            dois = Math.floor(dinheiro/2);
            dinheiro = dinheiro%2;
            um = Math.floor(dinheiro/1);
            dinheiro = dinheiro%1;
            cent50 = Math.floor(dinheiro/0.5);
            dinheiro = dinheiro%0.5;
            cent25 = Math.floor(dinheiro/0.25);
            dinheiro = dinheiro%0.25;
            cent10 = Math.floor(dinheiro/0.1);
            dinheiro = dinheiro%0.1;
            cent5 = Math.floor(dinheiro/0.05);
            dinheiro = dinheiro%0.05;
            cent1 = dinheiro/0.01;

            System.out.println("NOTAS:");
            System.out.printf("%.0f nota(s) de R$ 100.00\n" , cem);
            System.out.printf("%.0f nota(s) de R$ 50.00\n", cinquenta);
            System.out.printf("%.0f nota(s) de R$ 20.00\n", vinte);
            System.out.printf("%.0f nota(s) de R$ 10.00\n", dez);
            System.out.printf("%.0f nota(s) de R$ 5.00\n", cinco);
            System.out.printf("%.0f nota(s) de R$ 2.00\n", dois);
            System.out.println("MOEDAS:");
            System.out.printf("%.0f moeda(s) de R$ 1.00\n", um);
            System.out.printf("%.0f moeda(s) de R$ 0.50\n", cent50);
            System.out.printf("%.0f moeda(s) de R$ 0.25\n", cent25);
            System.out.printf("%.0f moeda(s) de R$ 0.10\n", cent10);
            System.out.printf("%.0f moeda(s) de R$ 0.05\n", cent5);
            System.out.printf("%.0f moeda(s) de R$ 0.01\n", cent1);

            sc.close();
        }    
    }
}
