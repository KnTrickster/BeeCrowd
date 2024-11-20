import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abc[] = sc.nextLine().split(" ");
        double a = Double.parseDouble(abc[0]);
        double b = Double.parseDouble(abc[1]);
        double c = Double.parseDouble(abc[2]);
        
        double delta = Math.pow(b, 2)-4*a*c;
        if(delta>0 && a>0){
            double r1 = (-b + Math.sqrt(delta))/(2*a); 
            double r2 = (-b - Math.sqrt(delta))/(2*a); 

            System.out.printf("R1 = %.5f\n",r1);
            System.out.printf("R2 = %.5f\n",r2);
        }
        else{
            System.out.println("Impossivel calcular");
        }
        sc.close();
    }
}
