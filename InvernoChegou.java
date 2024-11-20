/*
Bem-vindos e bem-vindas à Escola de Inverno da Maratona de Programação 2015 de Erechim! Esperamos sinceramente que vocês aprendam muito nestes dias para que tenham muito sucesso nas competições de Programação ainda por vir, mas sobretudo esperamos que vocês curtam a Escola, pois quando nos divertimos e temos prazer em estudar e programar, o treino deixa de ser um fardo e se torna um hobby. Então, divirtam-se!

O inverno é uma estação maravilhosa, não é mesmo? Todos nós amamos vestir um poncho, participar de uma roda de chimarrão, assar pinhões no fogão a lenha… Mas nem todos gostam do inverno, especialmente em lugares onde o inverno costuma ser muito cruel. Em Westeros, por exemplo, o humor das pessoas é definido de acordo com as tendências climáticas. Com base nas temperaturas dos três últimos dias, as pessoas podem ficar tristes ou felizes, ficando mais propensas a fazer guerra ou fazer amor, respectivamente. E, sejamos sinceros, é justamente por causa das cenas de amor e de guerra que amamos Game of Thrones!

X Se a temperatura desceu do 1º para o 2º dia, mas subiu ou permaneceu constante do 2º para o 3º, as pessoas ficam felizes (primeira figura).
X Se a temperatura subiu do 1º para o 2º dia, mas desceu ou permaneceu constante do 2º para o 3º, as pessoas ficam tristes (segunda figura).
X Se a temperatura subiu do 1º para o 2º dia e do 2º para o 3º, mas subiu do 2º para o 3º menos do que subira do 1º para o 2º, as pessoas ficam tristes (terceira figura).
X Se a temperatura subiu do 1º para o 2º dia e do 2º para o 3º, mas subiu do 2º para o 3º no mínimo o tanto que subira do 1º para o 2º, as pessoas ficam felizes (quarta figura).
X Se a temperatura desceu do 1º para o 2º dia e do 2º para o 3º, mas desceu do 2º para o 3º menos do que descera do 1º para o 2º, as pessoas ficam felizes (quinta figura).

- Se a temperatura desceu do 1º para o 2º dia e do 2º para o 3º, mas desceu do 2º para o 3º no mínimo o tanto que descera do 1º para o 2º, as pessoas ficam tristes (sexta figura).
- Se a temperatura permaneceu constante do 1º para o 2º dia, as pessoas ficam felizes se subiu do 2º para o 3º dia ou tristes caso contrário (respectivamente, sétima e oitava figuras). 
*/
// aumenta "<", diminui ">", constante "=".
import java.util.Scanner;
public class InvernoChegou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temperaturas [] = sc.nextLine().split(" ");
        int T1 = Integer.parseInt(temperaturas[0]);
        int T2 = Integer.parseInt(temperaturas[1]);
        int T3 = Integer.parseInt(temperaturas[2]);
        sc.close();
        if (T1>T2 && T2<=T3){
            System.out.println(":)");
        }
        else if (T1<T2 && T2>=T3){
            System.out.println(":(");
        }
        else if (T1<T2 && T2<T3 && (T3-T2)<(T2-T1)){
            System.out.println(":(");
        }
        else if (T1<T2 && T2<T3 && (T3-T2)>=(T2-T1)){
            System.out.println(":)");
        }
        else if (T1>T2 && T2>T3 && (T2-T3)<(T1-T2)){
            System.out.println(":)");
        }
        else if (T1>T2 && T2>T3 && (T2-T3)>=(T1-T2)){
            System.out.println(":(");
        }
        else if (T1==T2 && T2<T3){
            System.out.println(":)");
        }
        else if (T1==T2 && T2>T3){
            System.out.println(":(");
        }
        else{
            System.out.println(":(");
        }
    }
}
