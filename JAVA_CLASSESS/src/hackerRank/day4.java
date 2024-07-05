package hackerRank;

import java.util.Scanner;

public class day4 {
    public static void main(String args[]){
        Scanner Scan = new Scanner(System.in);


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = Scan.nextInt();
        int[] testAges = new int[n];

        // System.out.println("Enter the ages:");

        for (int i = 0; i < n; i++) {
            testAges[i] = Scan.nextInt();
            //  System.out.println(testAges[i]);
        }
    }
}
