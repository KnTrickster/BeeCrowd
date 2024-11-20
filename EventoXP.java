import java.util.Scanner;

public class EventoXP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int experiencia=1, multiplicador=1;
        while (multiplicador != 0 && experiencia != 0){
            String xp [] = sc.nextLine().split(" ");
            multiplicador = Integer.parseInt(xp[0]);
            experiencia = Integer.parseInt(xp[1]);
            int xpTotal = multiplicador*experiencia;
            if(xpTotal != 0){
                System.out.println(xpTotal);
            }
        }
        sc.close();
    }
}
