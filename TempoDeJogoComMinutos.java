import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tempo[] = sc.nextLine().split(" ");
        int horaInicial = Integer.parseInt(tempo[0]);
        int minInicial = Integer.parseInt(tempo[1]);
        
        int horaFinal = Integer.parseInt(tempo[2]);
        int minFinal = Integer.parseInt(tempo[3]);
        int horas = 0, minutos;
        //horas
        if (horaInicial < horaFinal){
            horas = horaFinal - horaInicial;
        }
        else if (horaInicial > horaFinal) {
            horas = 24-horaInicial+horaFinal;
        }
        else {
            horas = 24;
        }
        
        //minutos
        if(minInicial<minFinal){
            minutos = minFinal - minInicial;
        }
        else if (minInicial>minFinal) {
            minutos = 60 - (minInicial-minFinal);
            horas-=1;
        }
        else {
            minutos = 0;
        }
        if(horas==24 && minutos!=0){
            horas=0;
        }
        
        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        sc.close();
    }
}
