import java.util.Scanner;

public class NotasDaProva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        if (nota>=86 && nota<=100){
            System.out.println("A");
        }
        else if(nota>=61 && nota<=85){
            System.out.println("B");
        }
        else if(nota>=36 && nota<=60){
            System.out.println("C");
        }
        else if(nota>=1 && nota<=35){
            System.out.println("D");
        }
        else{
            System.out.println("E");
        }
        sc.close();
    }
}
