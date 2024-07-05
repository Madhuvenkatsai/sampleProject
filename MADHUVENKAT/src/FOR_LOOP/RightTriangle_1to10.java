package FOR_LOOP;

public class RightTriangle_1to10 {
    public static void main(String args[]){
        int n=1;
        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n);
                n++;
            }

            System.out.println();
        }
    }
}
