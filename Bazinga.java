import java.util.Scanner;

public class Bazinga {
    public static void main(String[] args) {
        // tesoura>papel 
        // papel>pedra
        // pedra>lagarto 
        // lagarto>Spock 
        // Spock>tesoura 
        // tesoura>lagarto 
        // lagarto>papel 
        // papel>Spock 
        // Spock>pedra
        // pedra>tesoura 
        // empate 
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i<=casos; i++){
            String disputas [] = sc.nextLine().split(" ");
            String Sheldon = disputas[0];
            String Raj = disputas[1];
            //empate
            if (Sheldon.equalsIgnoreCase(Raj)){
                System.out.println("Caso #"+ i +": De novo!");
            }
            //tesoura
            else if (Sheldon.equalsIgnoreCase("tesoura")){
                if (Raj.equalsIgnoreCase("papel")){
                    System.out.println("Caso #" + i + ": Bazinga!");
                }
                else if (Raj.equalsIgnoreCase("lagarto")){
                    System.out.println("Caso #" + i + ": Bazinga!");
                }
                else if (Raj.equalsIgnoreCase("Spock")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
                }
                else if (Raj.equalsIgnoreCase("pedra")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
                }
            }
            //papel
            else if (Sheldon.equalsIgnoreCase("papel")){
                if (Raj.equalsIgnoreCase("lagarto")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
                }
                else if (Raj.equalsIgnoreCase("Spock")){
                    System.out.println("Caso #" + i + ": Bazinga!");
                }
                else if (Raj.equalsIgnoreCase("pedra")){
                    System.out.println("Caso #" + i + ": Bazinga!");
                }
                else if (Raj.equalsIgnoreCase("tesoura")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
                }
            }
            //pedra
            else if (Sheldon.equalsIgnoreCase("pedra")){
                if (Raj.equalsIgnoreCase("lagarto")){
                    System.out.println("Caso #" + i + ": Bazinga!");
                }
                else if (Raj.equalsIgnoreCase("tesoura")){
                    System.out.println("Caso #" + i + ": Bazinga!");
                }
                else if (Raj.equalsIgnoreCase("papel")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
                }
                else if (Raj.equalsIgnoreCase("Spock")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
                }
            }
            //Spock
            else if (Sheldon.equalsIgnoreCase("Spock")){
                if (Raj.equalsIgnoreCase("pedra")){
                    System.out.println("Caso #" + i + ": Bazinga!");
                }
                else if (Raj.equalsIgnoreCase("tesoura")){
                    System.out.println("Caso #" + i + ": Bazinga!");
                }
                else if (Raj.equalsIgnoreCase("papel")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
                }
                else if (Raj.equalsIgnoreCase("lagarto")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
                }
            }
            //lagarto
            else if (Sheldon.equalsIgnoreCase("lagarto")){
                if (Raj.equalsIgnoreCase("tesoura")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
                }
                else if (Raj.equalsIgnoreCase("pedra")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
                }
                else if (Raj.equalsIgnoreCase("Spock")){
                    System.out.println("Caso #" + i + ": Bazinga!");
                }
                else if (Raj.equalsIgnoreCase("papel")){
                    System.out.println("Caso #" + i + ": Bazinga!");
                }
            }
        }
        sc.close();
    }
}
