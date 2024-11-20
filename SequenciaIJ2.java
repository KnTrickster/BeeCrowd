public class SequenciaIJ2 {
    public static void main(String[] args) {
        int i=1,j=7;
        while(i!=11){
            System.out.println("I="+i+" J="+j);
            if(j==5){
                i+=2;
                j+=2;
            }
            else{
                j--;
            }
        }
    }
}
