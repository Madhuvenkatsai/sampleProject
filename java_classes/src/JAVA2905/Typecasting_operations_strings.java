package JAVA2905;

public class Typecasting_operations_strings {
    public static void main(String args[]){        //TYPE CASTING
        System.out.println("is of two types automatically,manually");
        System.out.println("in automatically it is converted into long value to short size");
        //in manual we converted short into long by adding a particular data type
        int a = 10;
        double b = a;
        System.out.println(a);
        System.out.println(b);
        int c = 120;
        byte num = (byte) c;
        System.out.println(num);
        String txt = "Good Afternoon";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.length());
        
        //OPERATIONS mainly imp are Arthemetic,Comparision,Logical
        //ARTHEMETIC OPERATIONS
        
        int NUM = 1;              //ADDITION
        int MYNUM = 2;
       int MYNUMBER = NUM+MYNUM;
       System.out.println(MYNUMBER);

       int l = 7;                //SUBTRACTION
       int p = 9;
       int y = l-p;
       System.out.println(y);

       int Q = 1;               //MULTIPLICATION
       int W = 4;
       int Z = Q*W;
       System.out.println(Z);

       int R = 4;               //DIVISION(reminder)
       int T = 5;
       int V = R/T;
       System.out.println(V);

       int N = 9;               //MODULUS(quotient)
       int M= 10;
       int X = N%M;
       System.out.println(X);

       int sum = 14;            //increment(+1)
       ++sum;
       System.out.println(sum);

       int sum2 = 10;           //decrement(-1)
       --sum2;
       System.out.println(sum2);

     //COMPARISION OPERATOR

     int firstnum = 10;        //equals to(gives boolean expression)
     int secnum = 20;
     System.out.println(firstnum==secnum);

     int NM = 12;             //not equal to (gives boolean expression)
     int MN = 13;
     System.out.println(NM!=MN);

     int g = 1;              //less than operator n greater than operator
     int r = 2;
     System.out.println(g<r);
     System.out.println(g>r);

     int o = 5;             //less than r equal n greater than r equal
     int t = 6;
     System.out.println(o<=t);
     System.out.println(t>=o);

     //LOGICAL OPERATOR
        int s = 18;         //&& opertion if both statements are true then returns true
        System.out.println(s<19 && s>15);

        int j = 1;          // || opeartor if one of them is false then it returns false
        System.out.println(j>1 || j<1);

        int f = 4;          // ! (not) it will returns false if it is also true
        System.out.println(!(f>1 || f<1));
    }
}
