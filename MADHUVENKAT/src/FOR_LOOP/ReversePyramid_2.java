package FOR_LOOP;

public class ReversePyramid_2 {
    public static void main(String args[]) {
        for (int i=5;i>=0;i--){
            for (int j=1;j<=5-i;j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k % 2 != 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}