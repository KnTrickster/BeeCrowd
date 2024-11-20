/*import java.util.Scanner;

public class DomingoDeManha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1>0){
            String tempo[] = sc.nextLine().split(":");
            int horas = Integer.parseInt(tempo[0]);
            int minutos = Integer.parseInt(tempo[1]);
            if (horas==7){
                System.out.println("Atraso maximo: " + minutos);
            }
            else if(horas>7){
                horas -= 7;
                minutos += (horas*60);
                System.out.println("Atraso maximo: " + minutos);
            }
            else{
                System.out.println("Atraso maximo: " + 0);
            }
        }
    }
}*/
import java.util.Scanner;

public class DomingoDeManha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String teste = sc.nextLine();
            String[] tempo = teste.split(":");
            int horas = Integer.parseInt(tempo[0]);
            int minutos = Integer.parseInt(tempo[1]);
            if (horas==7){
                System.out.println("Atraso maximo: " + minutos);
            }
            else if(horas>7){
                horas -= 7;
                minutos += (horas*60);
                System.out.println("Atraso maximo: " + minutos);
            }
            else{
                System.out.println("Atraso maximo: " + 0);
            }
        }
        sc.close();
    }
}

