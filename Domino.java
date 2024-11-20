import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int pecas = ((n+1)*(n+2))/2;
        System.out.println(pecas);
    }
}
