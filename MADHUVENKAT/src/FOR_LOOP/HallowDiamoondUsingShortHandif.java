package FOR_LOOP;

public class HallowDiamoondUsingShortHandif {
    public static void main(String[] args) {
      /*  int size=8;
        for(int i=0; i<size; i++){
            for(int j=0;j<size-i-1;j++)
                System.out.print(" ");
            for(int j=0;j<2*i+1;j++)
                System.out.print((j==0||j==2*i)? "*" : " ");
            System.out.println();
        }
        for(int i=size-2; i>=0;i--){
            for(int j=0;j<size-i-1;j++)
                System.out.print(" ");
            for(int j=0; j<2*i+1;j++)
                System.out.print((j==0||j==2*i)? "*" : " ");
            System.out.println();
        }

       */

        int n = 5;
        int totalRows = 2 * n - 1;
        for (int i = 1; i <= totalRows; i++) {
            int starsInRow = (i <= n) ? i : totalRows - i + 1;
            int spacesBeforeStars = n - starsInRow;
            for (int j = 0; j < spacesBeforeStars; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= 2 * starsInRow - 1; j++) {
                System.out.print((j == 1 || j == 2 * starsInRow - 1) ? "*" : " ");
            }
            System.out.println();

        }
    }
}

