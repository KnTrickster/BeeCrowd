import java.util.Scanner;

public class PreencheVetor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n[] = new int [1000];
        
        for(int i=0;i<n.length;i++){
            n[i] %= t;
        }
        for (int i=0;i<n.length;i++){
            System.out.println("N[" + i + "] = " + n[i]);
        }
        sc.close();
    }
}
