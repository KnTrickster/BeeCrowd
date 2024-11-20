import java.util.Scanner;

public class MaiorAndPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando um array para armazenar os valores
        int[] valores = new int[10];

        // Lendo os valores
        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }

        // Inicializando o maior valor com o primeiro valor do array
        int maiorValor = valores[0];

        // Armazenando a posição do maior valor
        int posicaoMaiorValor = 0;

        // Percorrendo o array para encontrar o maior valor
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
                posicaoMaiorValor = i;
            }
        }
        posicaoMaiorValor+=1;
        System.out.println(maiorValor + "\n" + posicaoMaiorValor);
        sc.close();
    }
}
