import java.util.Scanner;

public class TipoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int alcool=0, gas=0, diesel = 0;
        int digito = sc.nextInt();

        while(digito != 4) {
            switch (digito) {
                case 1:
                    alcool++;
                    break;

                case 2:
                    gas++;
                    break;

                case 3:
                    diesel++;
                    break;
            }
            digito = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO\nAlcool: " + alcool + "\nGasolina: " + gas + "\nDiesel: " + diesel);
        sc.close();
    }
}
