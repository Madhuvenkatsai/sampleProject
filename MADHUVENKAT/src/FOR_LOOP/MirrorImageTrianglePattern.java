package FOR_LOOP;
public class MirrorImageTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;
        int n= rows*2-1;
        for(int i=1;i<=rows;i++){
            int spaces = (i<=rows)? i : rows*2-1+i;
            int s = n-spaces;
            for(int j=1;j<=i;j--){
                System.out.print("-");
            }
            for(int k =1;k<=i*2-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}





