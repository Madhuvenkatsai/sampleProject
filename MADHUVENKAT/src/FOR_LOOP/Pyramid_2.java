package FOR_LOOP;

public class Pyramid_2 {
    public static void main(String args[]) {
        int n = 5;
            for (int i = n - 1; i >= 1; i--) {
                for (int j = i; j <= n; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    if (k % 2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
