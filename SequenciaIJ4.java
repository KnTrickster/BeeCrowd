public class SequenciaIJ4 {
    public static void main(String[] args) {
        double x=0, i=0, j=1;
        int naturalI, naturalJ;
        while (i<=2){
            if(x!=3) {
                System.out.printf("I=%.1f",i); 
                System.out.printf(" J=%.1f\n",j); 
                j++;
                x++;
            }
            else {
                i+=0.2;
                j-=2.8;
                x=0;
            }  
            if(j==1){
                System.out.println("I=");

            } 
        }
    }
}
/*double x=0, i=0.2, j=1.2;
        int inicio=1;
        if(inicio<=3){
            System.out.println("I=0 J=" + inicio);
            inicio++;
        } */

    