import java.util.Scanner;

public class SequenciaLogica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String valores[] = sc.nextLine().split(" ");
        int x = Integer.parseInt(valores[0]);
        int y = Integer.parseInt(valores[1]);

        for (int i = 1; i<=y; i++){
            for (int a = x; a==x; a++){
                if (i%a==0){
                    System.out.println(i);
                }
                else{
                System.out.print(i + " ");
                }
            }
        }

        
        sc.close();
    }
}
