package METHODS;
public class SquareHollowPattern {
        public void hollow(int rows, int start){
            if(start<=rows){
                stars(rows, start, rows);
                System.out.println();
                hollow(rows, start+1);
            }
        }
        public void stars(int columns, int starting, int rows){
            if(columns>0){
                if(starting==1 || 1==columns || columns==rows || starting ==rows){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
                stars(columns-1, starting, rows);
            }
        }
    public static void main(String[] args) {
        SquareHollowPattern squareHollowPattern = new SquareHollowPattern();
        squareHollowPattern.hollow(5, 1);

        /*int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
    }
}
