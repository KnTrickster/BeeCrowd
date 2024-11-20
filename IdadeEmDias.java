import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anos=0, meses=0;
        int dias = sc.nextInt();

        while(dias>=365){
            anos = dias/365;
            dias = dias%365;
        }
        while(dias>=30){
            meses = dias/30;
            dias = dias%30;
        }

        System.out.println(anos+ " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
        sc.close();
    }
}
