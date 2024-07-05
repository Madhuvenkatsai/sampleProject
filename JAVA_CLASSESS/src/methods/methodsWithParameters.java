package methods;

public class methodsWithParameters {
    public static int m1(int a, int b){
        int c = a+b;
        return c;
    }
    public static String m2(String fnme, String lname, int b){
        String fullname = fnme +lname;
        return fullname;
    }
    public static void main(String args[]){
       System.out.println( m1(5,6));

       int add = m1(10,30);
       System.out.println(add);
        System.out.println( m2("swathi","p378wsj", 8));

    }
}
