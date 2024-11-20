import java.util.Scanner;

public class HoHoHo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ho = sc.nextInt();
        for (int i=0; i<(ho-1); i++){
            System.out.print("Ho ");
        }
        System.out.print("Ho!\n");
        sc.close();
    }
}
