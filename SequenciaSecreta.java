import java.util.Scanner;

public class SequenciaSecreta{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contagem=0, valorAnt=0;
        int linhas = sc.nextInt();
        int valores[] = new int [linhas];
        if (linhas>=3){
            for (int i = 0; i<linhas; i++){
                valores[i] = sc.nextInt();
            }
            for (int i = 0; i<valores.length; i++){
                if(valores[i]!=valorAnt){
                   contagem++;
                   valorAnt = valores[i];
                }
            }
        }
        System.out.println(contagem);
        sc.close();
    }
}