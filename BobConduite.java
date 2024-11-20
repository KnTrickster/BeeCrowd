import java.util.Scanner;

public class BobConduite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<casos; i++){
            String raios[] = sc.nextLine().split(" ");
            int r1 = Integer.parseInt(raios[0]);
            int r2 = Integer.parseInt(raios[1]);
            int soma = r1+r2;
            System.out.println(soma);
        }
        sc.close();
    }
}
