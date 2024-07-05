package TEST1;

public class MPattern {
    public static void main(String[] args) {
        int height = 7;
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < 2 * height - 1; col++) {
                if (col == 0 || col == 2 * height - 2 || (row <= height / 2 && (col == row || col == 2 * height - 2 - row))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
