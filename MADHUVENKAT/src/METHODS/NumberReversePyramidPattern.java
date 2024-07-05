package METHODS;

public class NumberReversePyramidPattern {

    public static void main(String[] args) {
        int rows =4;
        printReversePyramid(rows);
    }
    public static void printReversePyramid(int rows) {
        if (rows>0){
            printNumbers(rows);
            System.out.println();
            printReversePyramid(rows - 1);
        }
    }
    public static void printNumbers(int num) {
        if (num>0) {
            printNumbers(num-1);
            System.out.print(num);
        }
    }
}
