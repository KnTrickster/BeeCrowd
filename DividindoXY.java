import java.util.Scanner;

public class DividindoXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sentinel = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<sentinel; i++){
            String xy[] = sc.nextLine().split(" ");
            double x = Double.parseDouble(xy[0]);
            double y = Double.parseDouble(xy[1]);
            if (y==0){
                System.out.println("divisao impossivel");
            }
            else{
                System.out.printf("%.1f\n",(x/y));
            }
        }
        

        sc.close();
    }
}
