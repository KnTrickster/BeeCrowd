import java.util.Scanner;

public class AbasDePericles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String action;
        String abas [] = sc.nextLine().split(" ");
        int abasAbertas = Integer.parseInt(abas[0]);
        int movimentos = Integer.parseInt(abas[1]);
        for(int i = 0; i<movimentos; i++){
            action = sc.nextLine();
            if(action.equals("fechou")){
                abasAbertas++;
            }
            else{
                abasAbertas += -1;
            }
        }
        sc.close();
        System.out.println(abasAbertas);
    }
}
