package LOOPS;

public class Fibonocci_series {
    public static void main(String args[]) {
        int i = 0;
        int j = 1;
        int k=1;
        int sum;
        while (k <= 5) {
            sum = i + j;
            i=j;
            j = sum;
            System.out.println(sum);
          k++;
        }
        //System.out.println(j);
    }
}
