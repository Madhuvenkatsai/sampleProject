package METHODS;
public class RhombusPattern {
    public void rhombus(int rows, int columns){
        if(columns<=rows){
            spaces(columns);
            stars(rows);
            System.out.println();
            rhombus(rows,columns+1);
        }
    }
    public void stars(int st){
        if(st>0){
           System.out.print("*");
           stars(st-1);
        }
    }
    public void spaces(int sp){
        if(sp>1){
            System.out.print("-");
            spaces(sp-1);

        }
    }

    public static void main (String args []){
        RhombusPattern rhombusPattern = new RhombusPattern();
        rhombusPattern.rhombus(5,2);
           /* int rows = 5;
            int columns = 4;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print("-");
                }
                for (int j = 1; j <= columns; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }*/
        }
    }

