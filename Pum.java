import java.util.Scanner;

public class Pum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 1; 
        for (int i = 0; i<x; i++) {
            System.out.print(n);
            n++;
            System.out.print(" " + n);
            n++;
            System.out.println(" " + n + " PUM");
            n+=2;
            sc.close();
        }
    }
}
