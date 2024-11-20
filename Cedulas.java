/*import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        int a=0, b=0, c=0, d=0, e=0, f=0, g=0;
        if (cash > 0) {
            a = cash/100;
            cash = cash%100;
            b = cash/50;
            cash = cash%50;
            c = cash/20;
            cash = cash%20;
            d = cash/10;
            cash = cash%10;
            e = cash/5;
            cash = cash%5;
            f = cash/2;
            cash = cash%2;
            g = cash/1;
        }
        System.out.println(a + " nota(s) de R$ 100,00\n" + b + " nota(s) de R$ 50,00\n" + c + " nota(s) de R$ 20,00\n" + d + " nota(s) de R$ 10,00\n" + e + " nota(s) de R$ 5,00\n" + f + " nota(s) de R$ 2,00\n" + g + " nota(s) de R$ 1,00\n");
        sc.close();
    }
} */

/*import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();

        if (cash > 0) {
            int[] notas = {100, 50, 20, 10, 5, 2, 1};
            int[] quantidadeNotas = new int[notas.length];

            for (int i = 0; i < notas.length; i++) {
                quantidadeNotas[i] = cash / notas[i];
                cash %= notas[i];
            }

            for (int i = 0; i < notas.length; i++) {
                System.out.println(quantidadeNotas[i] + " nota(s) de R$ " + notas[i] + ",00");
            }
        }

        sc.close();
    }
} */

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cash = n;
        int a=0, b=0, c=0, d=0, e=0, f=0, g=0;
        if (cash > 0) {
            a = cash/100;
            cash = cash%100;
            b = cash/50;
            cash = cash%50;
            c = cash/20;
            cash = cash%20;
            d = cash/10;
            cash = cash%10;
            e = cash/5;
            cash = cash%5;
            f = cash/2;
            cash = cash%2;
            g = cash/1;
        }
        System.out.println(n + "\n"+ a + " nota(s) de R$ 100,00\n" + b + " nota(s) de R$ 50,00\n" + c + " nota(s) de R$ 20,00\n" + d + " nota(s) de R$ 10,00\n" + e + " nota(s) de R$ 5,00\n" + f + " nota(s) de R$ 2,00\n" + g + " nota(s) de R$ 1,00\n");
        sc.close();
    }
}
