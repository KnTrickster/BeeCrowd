import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vertebra, tipo, dieta;

        /* 
        vertebra = sc.nextLine();
        //Vertebrado 
        if (vertebra=="vertebrado"){
            tipo = sc.nextLine();
                if (tipo=="ave"){
                dieta = sc.nextLine(); 
                    if(dieta=="carnivoro"){
                        System.out.println("aguia");
                    }
                    else if (dieta=="onivoro"){
                        System.out.println("pomba");
                    }
                }
                else if (tipo == "mamifero"){
                    dieta = sc.nextLine();
                    if (dieta=="onivoro"){
                        System.out.println("homem");
                    }
                    else if (dieta == "herbivoro"){
                        System.out.println("vaca");
                    }
                }
        }
        //Invertebrado
        else {
            vertebra="invertebrado";
            tipo = sc.nextLine();
                if(tipo=="inseto"){
                    dieta = sc.nextLine();
                        if(dieta=="hematofago"){
                            System.out.println("pulga");
                        }
                        else if(dieta=="herbivoro"){
                            System.out.println("lagarta");
                        }
                }
                else if (tipo == "analideo"){
                    dieta = sc.nextLine();
                        if(dieta=="hematofago"){
                            System.out.println("sanguessuga");
                        }
                        else if (dieta == "onivoro"){
                            System.out.println("minhoca");
                        }
                }
        } */
        


        vertebra = sc.nextLine();
        tipo = sc.nextLine();
        dieta = sc.nextLine();
        if (vertebra.equals("vertebrado") && tipo.equals("ave") && dieta.equals("carnivoro")){
            System.out.println("aguia");
        } 
        else if (vertebra.equals("vertebrado") && tipo.equals("ave") && dieta.equals("onivoro")){
            System.out.println("pomba");
        } 
        else if (vertebra.equals("vertebrado") && tipo.equals("mamifero") && dieta.equals("onivoro")){
            System.out.println("homem");
        } 
        else if (vertebra.equals("vertebrado") && tipo.equals("mamifero") && dieta.equals("herbivoro")){
            System.out.println("vaca");
        } 
        else if (vertebra.equals("invertebrado") && tipo.equals("inseto") && dieta.equals("hematofago")){
            System.out.println("pulga");
        } 
        else if (vertebra.equals("invertebrado") && tipo.equals("inseto") && dieta.equals("herbivoro")){
            System.out.println("lagarta");
        } 
        else if (vertebra.equals("invertebrado") && tipo.equals("anelideo") && dieta.equals("hematofago")){
            System.out.println("sanguessuga");
        }
        else if (vertebra.equals("invertebrado") && tipo.equals("anelideo") && dieta.equals("onivoro")){
            System.out.println("minhoca");
        } 
        sc.close();
    }
}