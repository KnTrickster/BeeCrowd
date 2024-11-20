import java.util.Scanner;

public class VezDeQuem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rodadas = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<rodadas; i++){
            String escolhas [] = sc.nextLine().split(" ");
            String nome1 = escolhas[0];
            String escolha1 = escolhas[1];
            String nome2 = escolhas[2];
            String escolha2 = escolhas[3];
            String valores[] = sc.nextLine().split(" ");
            int n1 = Integer.parseInt(valores [0]);
            int n2 = Integer.parseInt(valores [1]);
            
            int resultado = n1+n2;
            if (resultado%2==0){
                if (escolha1.equals("PAR")){
                    System.out.println(nome1);
                }
                else{
                    System.out.println(nome2);
                }
            }
            else{
                if (escolha2.equals("IMPAR")){
                    System.out.println(nome2);
                }
                else{
                    System.out.println(nome1);
                }
            }
        }
        sc.close();
    }
}
