import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codes[] = sc.nextLine().split(" ");
        int codigo = Integer.parseInt(codes[0]);
        int quantidade = Integer.parseInt(codes[1]);
        double preco = 0, total;
        switch (codigo) {
            case 1:
                preco = 4;
                break;
            case 2:
            preco = 4.5;
                break;
            case 3:
                preco = 5;
                break;
            case 4:
                preco = 2;
                break;
            case 5:
                preco = 1.5;
                break;
        } 
        total = preco * quantidade;
        System.out.printf("Total: R$ %.2f\n", total);
        sc.close();
    }
}
