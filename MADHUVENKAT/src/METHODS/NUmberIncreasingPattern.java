package METHODS;
public class NUmberIncreasingPattern{
    public static void nums(int rows, int columns){
        if(rows<=columns){
            stars(rows,1);
            System.out.println();
            nums(rows+1,columns);
        }
    }
    public static void stars(int st,int n){
        if(n<=st){
            System.out.print(n);
            stars(st,n+1);
        }
    }

    public static void main(String args[]){
        NUmberIncreasingPattern NUberIncreasingPattern = new NUmberIncreasingPattern();
        NUmberIncreasingPattern.nums(1,4);
    }
}