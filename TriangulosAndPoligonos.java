import java.util.Scanner;

public class TriangulosAndPoligonos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ladosDoPoligono = sc.nextInt();
        int triangulos = ladosDoPoligono - 2;
        System.out.println(triangulos);  
        sc.close();
    }
}
