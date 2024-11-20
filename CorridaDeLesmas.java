import java.util.Scanner;

public class CorridaDeLesmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int testes = sc.nextInt();
            sc.nextLine();
            
            String velocidade = sc.nextLine();
            String n [] = velocidade.split(" ");
            int maiorVel = Integer.parseInt(n[0]);
            for (int i = 0; i<testes; i++){
                int velAtual = Integer.parseInt(n[i]);
                if(maiorVel<velAtual){
                    maiorVel = velAtual;
                }
            }
            if(maiorVel<10){
                System.out.println(1);
            }
            else if(maiorVel < 20 && maiorVel >= 10){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
        }
        sc.close();
    }
}
