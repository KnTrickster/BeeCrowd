import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dados1 [] = sc.nextLine().split(" ");
        int id1 = Integer.parseInt(dados1[0]);
        int quantidade1 = Integer.parseInt(dados1[1]);
        double preco1 = Double.parseDouble(dados1[2]);
        double primeiroValor = quantidade1*preco1;

        String dados2 [] = sc.nextLine().split(" ");
        int id2 = Integer.parseInt(dados2[0]);
        int quantidade2 = Integer.parseInt(dados2[1]);
        double preco2 = Double.parseDouble(dados2[2]);
        double segundoValor = quantidade2*preco2;

        double valor = primeiroValor + segundoValor;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);


        sc.close();
    }    
}
