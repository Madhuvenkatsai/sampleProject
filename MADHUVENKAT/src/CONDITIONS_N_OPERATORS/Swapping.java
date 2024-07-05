package CONDITIONS_N_OPERATORS;

public class Swapping {
    public static void main(String args[]){
        int a = 6;
        int b = 8;
        int c =a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

        int x = 6;
        int y = 8;
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println(x);
        System.out.println(y);
    }
}

