package FOR_LOOP;

public class InvertedPyramid {
    public static void main(String args[]){
        for(int i = 5;  i>0; i--){
            for(int a=1; a<=i; a++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
