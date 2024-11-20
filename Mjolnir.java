import java.util.Scanner;

public class Mjolnir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tentativas = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<tentativas; i++){
            String desafio[] = sc.nextLine().split(" ");
            String nome = desafio[0];
            //int newtons = Integer.parseInt(desafio[1]);
            if (nome.equals("Thor")){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }
        }


        sc.close();

    }
}
