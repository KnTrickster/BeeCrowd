import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        sc.nextLine();
        double saida[] = new double [n];

        if(n>0){
            for(int i=0; i<n; i++){
                String valores1[] = sc.nextLine().split(" ");
                double nota1_1 = Double.parseDouble(valores1[0]);
                double nota2_1 = Double.parseDouble(valores1[1]);
                double nota3_1 = Double.parseDouble(valores1[2]);
                double total = (nota1_1*2+nota2_1*3+nota3_1*5)/10; 
                saida[i] = total;
            }
            for (int i=0; i<n; i++){
                System.out.printf("%.1f\n",saida[i]);
            }
        }
        sc.close();
    }
}

        

        /*
        String valores2[] = sc.nextLine().split(" ");
        int nota1_2 = Integer.parseInt(valores2[0]);
        int nota2_2 = Integer.parseInt(valores2[1]);
        int nota3_2 = Integer.parseInt(valores2[2]);
        int produto2 = (nota1_2+nota2_2+nota3_2)*2;

        String valores3[] = sc.nextLine().split(" ");
        int nota1_3 = Integer.parseInt(valores3[0]);
        int nota2_3 = Integer.parseInt(valores3[1]);
        int nota3_3 = Integer.parseInt(valores3[2]);
        int produto3 = (nota1_3+nota2_3+nota3_3)*2;
        */




 