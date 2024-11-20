import java.util.Scanner;
public class Quadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=1, y=1;
        
        while(x!=0 && y!=0){
            String coordenadas[] = sc.nextLine().split(" ");
            x = Integer.parseInt(coordenadas[0]);
            y = Integer.parseInt(coordenadas[1]);

            if (x>0 && y>0) {
                System.out.println("primeiro");
            } 
            else if (x<0 && y>0) {
                System.out.println("segundo");
            }
            else if (x<0 && y<0) {
                System.out.println("terceiro");
            }
            else if (x>0 && y<0) {
                System.out.println("quarto");
            }
        }
        sc.close();
    }
}

