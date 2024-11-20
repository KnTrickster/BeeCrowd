import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dados[] = sc.nextLine().split(" ");
        double n1 = Double.parseDouble(dados[0]);
        double n2 = Double.parseDouble(dados[1]);
        double n3 = Double.parseDouble(dados[2]);
        double n4 = Double.parseDouble(dados[3]);

        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;
        media = Math.floor(media * 10) / 10.0; //ajuste, pois a entrada "2.0 6.5 4.0 9.0" o resultado saia 4,9 ao invés 4,8. Resultado após arredondar 4,85 para cima 
        System.out.printf("Media: %.1f\n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double exame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", exame);
            media = (media + exame) / 2;
            media = Math.floor(media * 10) / 10.0;  
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", media);
        }
        sc.close();
    }
}
