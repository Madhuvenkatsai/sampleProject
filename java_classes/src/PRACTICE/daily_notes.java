package PRACTICE;

public class daily_notes {
    public static void main(String args[]){
        System.out.println("on 27 i have learned about basics in java");
        System.out.println(" installed intallij idea");
        System.out.println("one is an object oriented language ");
        System.out.println("In this it is consisting of package n class n method");
        System.out.println("First class name and next object name");
        System.out.println("In comments representation is double slash");
        System.out.println("If multiple comments then starts with slash n star and end with star n slash");
        System.out.println("in println ln is used for line if only print is typed then it will not enter another line");
        System.out.println();
        System.out.println("on 28th i have learned topic variables");
        System.out.println("data types are of 5 types they are ");
        System.out.println("int,char,float,string,boolean");
        System.out.println("VARIABLES");
        int num = 10;
        //for 5 types they are having limit
        float A = 23.12f;
        //where ever float is occured then we should keep f at last
        char B = 'A';
        //char must be stored in single quotations
        String C = "good evening";
        boolean D = true;
        System.out.println("num");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println();
        System.out.println("on 29th may");
        System.out.println("is of two types automatically,manually");
        System.out.println("in automatically it is converted into long value to short size");
        //in manual we converted short into long by adding a particular data type
        int a = 10;
        double b = a;
        System.out.println(a);
        System.out.println(b);
        int c = 120;
        byte num1 = (byte) c;
        System.out.println(num1);
        String txt = "Good Afternoon";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.length());
        //OPERATIONS mainly imp are Arthemetic,Comparision,Logical
        int NUM = 1;              //ADDITION
        int MYNUM = 2;
        int MYNUMBER = NUM+MYNUM;
        System.out.println(MYNUMBER);

        //ARTHMETIC

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
