package FOR_LOOP;

public class PascalsTriangle {
    public static void main(String args[]) {
        int size = 8;
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k=1;k<=i*2-1;k++) {
                if(k%2!=0) {
                    if (k == 1 || k == i * 2 - 1) {
                        System.out.print(1);
                    } else {
                        System.out.print(i-1);
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}


