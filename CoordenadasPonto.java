import java.util.Scanner;
public class CoordenadasPonto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coordenadas[] = sc.nextLine().split(" ");
        double x = Double.parseDouble(coordenadas[0]);
        double y = Double.parseDouble(coordenadas[1]);
        
        if (x>0 && y>0) {
            System.out.println("Q1");
        } 
        else if (x<0 && y>0) {
            System.out.println("Q2");
        }
        else if (x<0 && y<0) {
            System.out.println("Q3");
        }
        else if (x>0 && y<0) {
            System.out.println("Q4");
        }
        else if (x!=0 && y==0) {
            System.out.println("Eixo X");
        }
        else if (x==0 && y != 0) {
            System.out.println("Eixo Y");
        }
        else {
            System.out.println("Origem");
        }
        sc.close();
    }
}
