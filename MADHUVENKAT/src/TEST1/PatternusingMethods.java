package TEST1;

public class PatternusingMethods {

    public static void main (String args[]){
        int size = 5;
       Pyramid(size);
        pyramid1(5,1);
    }

   // int i;
    public static void pyramid1(int rows, int start){
        if(rows>0){
            spaces(rows);
            stars(2*start-1,start+1-start);
            System.out.println();
            pyramid1(rows-1,start+1);
        }
    }
    public static void spaces(int sp){
        if(sp>0){
            System.out.print("-");
            spaces(sp-1);
        }
    }
    public static void stars(int row, int st){
        if(st<=row){
            System.out.print(st);
            stars(row,st+1);
        }
    }
    public static void Pyramid(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <size; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
