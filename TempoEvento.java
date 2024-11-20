import java.util.Scanner;

public class TempoEvento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String diaInicial [] = sc.nextLine().split(" ");
        int diaX = Integer.parseInt(diaInicial[1]); 

        String tempoInicial[] = sc.nextLine().split(" : ");
        int horaInicial = Integer.parseInt(tempoInicial[0]);
        int minInicial = Integer.parseInt(tempoInicial[1]);
        int segInicial = Integer.parseInt(tempoInicial[2]);
        
        String diaFinal [] = sc.nextLine().split(" ");
        int diaY = Integer.parseInt(diaFinal[1]);

        String tempoFinal[] = sc.nextLine().split(" : ");
        int horaFinal = Integer.parseInt(tempoFinal[0]);
        int minFinal = Integer.parseInt(tempoFinal[1]);
        int segFinal = Integer.parseInt(tempoFinal[2]);

        //declaração de hrs e mins
        int dias=0, horas = 0, minutos, segundos;
        
        //dias 
        dias = diaY - diaX;
        //horas 
        if (horaInicial < horaFinal){
            horas = horaFinal - horaInicial;
        }
        else if (horaInicial > horaFinal) {
            horas = 24-horaInicial+horaFinal;
            dias-=1;
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

        //Segundos
        if(segInicial<segFinal){
            segundos = segFinal - segInicial;
        }
        else if (segInicial>segFinal) {
            segundos = 60 - (segInicial-segFinal);
            minutos-=1;
        }
        else {
            segundos = 0;
        }
        //Caso Especial (24h + min ou seg > 0)
        if (horas==24 && minutos!=0 || horas==24 && segundos!=0){
            horas=0;
        }
        if (horas==24) {
            horas = 0;
        }
        
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        sc.close();
    }
}
