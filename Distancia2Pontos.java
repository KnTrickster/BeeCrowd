import java.util.Scanner;

public class Distancia2Pontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String XY1[] = sc.nextLine().split(" ");
        double X1 = Double.parseDouble(XY1[0]);
        double Y1 = Double.parseDouble(XY1[1]);
        String XY2[] = sc.nextLine().split(" ");
        double X2 = Double.parseDouble(XY2[0]);
        double Y2 = Double.parseDouble(XY2[1]);

        double distancia = Math.sqrt(Math.pow((X2-X1),2)+Math.pow((Y2-Y1),2));

        System.out.printf("%.4f\n",distancia);

        sc.close();
    }
}
