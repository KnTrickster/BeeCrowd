import java.util.Scanner;

public class ConverteTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas=0, minutos=0, segundos;
        segundos = sc.nextInt();
        while (segundos>=3600) {
            horas = segundos/3600;
            segundos = segundos%3600;
        }
        while(segundos>=60){
            minutos = segundos/60;
            segundos = segundos%60;
        }
        System.out.println(horas + ":" + minutos + ":" + segundos);
        sc.close();
    }
}
