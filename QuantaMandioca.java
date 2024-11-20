/*
Todo ano em abril reúnem-se na casa da dona Chica o Curupira, Boitatá, o Boto cor de rosa (esse em sua forma de homem, já que assim dona chica gosta mais), o Mapinguari e a Iara para se lembrar de seus momentos com Mani, a bela menina de pele branca. E como não poderia ser diferente o prato principal dessa reunião é a mandioca. Cada um deles come de uma a dez porções de mandioca e eles sempre avisam dona Chica com antecedência a respeito de quantas porções irão comer nesse dia. O tamanho da porção de cada um é diferente, mas sempre são os mesmos. As porções são as seguintes (em gramas):

O Curupira come 300

O Boitatá come 1500

O Boto come 600

O Mapinguari 1000

A Iara come 150

Dona chica por sua vez sempre come 225 gramas de mandioca. Cansada de todo ano ter que calcular quanta mandioca preparar ela contactou você para escrever um programa que informe quanta mandioca deve ser preparada em gramas.

Entrada
A entrada consiste de 5 inteiros cada um representando as porções que os convidados de dona Chica vão consumir. O primeiro inteiro representa as porções do Curupira, o segundo do Boitatá, o terceiro do Boto, o quarto do Mapinguari e o quinto a da Iara.

Saída
A saída consiste de um único inteiro que representa quanta mandioca dona Chica deve preparar em gramas. Não esqueça da quebra de linha após a resposta :).
*/
import java.util.Scanner;

public class QuantaMandioca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qntCurupira = sc.nextInt();
        int qntBoitata = sc.nextInt();
        int qntBoto = sc.nextInt();
        int qntMapinguari = sc.nextInt();
        int qntIara = sc.nextInt();
        int totalMandioca = 225 + (qntCurupira*300) + (qntBoitata*1500) + (qntBoto*600) + (qntMapinguari*1000) + (qntIara*150);
        System.out.println(totalMandioca);
        sc.close();
    }   
}
