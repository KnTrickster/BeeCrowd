import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ABC[] = sc.nextLine().split(" ");
        int A = Integer.parseInt(ABC[0]);
        int B = Integer.parseInt(ABC[1]);
        int C = Integer.parseInt(ABC[2]);

        int maiorAB = (A+B+Math.abs(A-B))/2;
        int maiorVerdadeiro = (maiorAB+C+Math.abs(maiorAB-C))/2;
        System.out.println(maiorVerdadeiro + " eh o maior");
        sc.close();
    }
}
