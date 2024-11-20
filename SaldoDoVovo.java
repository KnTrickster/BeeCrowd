import java.util.Scanner;

public class SaldoDoVovo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dados[] = sc.nextLine().split(" ");
        int dias = Integer.parseInt(dados[0]);
        int saldo = Integer.parseInt(dados[1]);
        int menorSaldo = saldo;
        for(int i = 0; i<dias; i++){
            int saldoDiario = sc.nextInt();
            saldo += saldoDiario;
            if(saldo<menorSaldo){
                menorSaldo = saldo;
            }
        }
        System.out.println(menorSaldo);
        sc.close();
    }
}
