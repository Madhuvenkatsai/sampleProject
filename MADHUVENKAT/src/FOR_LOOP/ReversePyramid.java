package FOR_LOOP;

public class ReversePyramid {
    public static void main(String args[]){
            for(int i=5;i>=1;i--){
               // System.out.print(i);
                for(int j=5;j>=i;j--){
                    System.out.print(" ");
                   // System.out.print(j);
                }
                for(int k =1;k<=i*2-1;k++){
                    System.out.print("*");
                   // System.out.print(k);
                }
                System.out.println();
            }
        }
    }

