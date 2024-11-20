import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String horas[] = sc.nextLine().split(" ");
        int inicio = Integer.parseInt(horas[0]);
        int fim = Integer.parseInt(horas[1]);
        int duracao;
        
        if (inicio < fim){
            duracao = fim - inicio;
        }
        else if (inicio > fim) {
            duracao = 24-inicio+fim;
        }
        else {
            duracao = 24;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
