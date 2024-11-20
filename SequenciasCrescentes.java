import java.io.IOException;
import java.util.Scanner;

public class SequenciasCrescentes {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0){
            String morraTimeLimit = "";
            for (int i = 1; i<n; i++){
                morraTimeLimit += i + " ";
            }
            System.out.println(morraTimeLimit + n);
            n = sc.nextInt();
        }
        sc.close();
    }
}
