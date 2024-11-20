import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vInter = 0, vGremio = 0, empates = 0, escolha = 1, grenais = 0;
        while (escolha == 1){
            String jogos[] = sc.nextLine().split(" ");
            int gInter = Integer.parseInt(jogos[0]);
            int gGremio = Integer.parseInt(jogos[1]);
            if (gInter>gGremio){
                vInter++;
            }
            else if (gInter<gGremio){
                vGremio++;
            }
            else{
                empates++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            grenais++;
            escolha = sc.nextInt();
            sc.nextLine();
        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vInter);
        System.out.println("Gremio:" + vGremio);
        System.out.println("Empates:" + empates);
        if (vInter>vGremio){
            System.out.println("Inter venceu mais");
        }
        else{
            System.out.println("Gremio venceu mais");
        }
        sc.close();
    }
}
