package methods;

public class patternUsingRecursion {
    public static void trainglePattern(int rows){
        if(rows >0){
            stars(rows);
            System.out.println();
            trainglePattern(rows -1);
        }

    }
    public static void stars(int st){
        if(st>0){
            System.out.print("*");
            stars(st-1);
        }

    }
    public static void main(String args[]){
        trainglePattern(5);
    }
}
