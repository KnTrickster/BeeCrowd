import java.util.Scanner;

public class TriDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cartas [] = sc.nextLine().split(" ");
        int carta1 = Integer.parseInt(cartas[0]);
        int carta2 = Integer.parseInt(cartas[1]);
        sc.close();
        // trio/dupla com carta 1
        if(carta1 == carta2 || carta1>carta2){
            System.out.println(carta1);
        }
        //dupla maior com carta 2
        else{
            System.out.println(carta2);
        }
    }
}
