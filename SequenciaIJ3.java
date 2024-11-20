public class SequenciaIJ3 {
    public static void main(String[] args) {
        int x=0, i=1, j=7;

        while (i!=11){
            if(x!=3){
                System.out.println("I="+ i + " J=" + j);
                j--;
                x++;
            }
            else {
                i+=2;
                j+=5;
                x=0;
            }
        }
    }
}
/*for(x=0; x==3; x++){
                System.out.println("I="+ i + " J=" + j);
            }*/