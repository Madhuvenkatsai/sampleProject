package operatorsAndTypeCasting;

public class typeCasting {
    public static void main(String args[]){
        int myInt = 9;  //smaller type(size)
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        double num = 2147483648.0000d;
        int myNum = (int)num;  //manual type casting
        System.out.println(num);
        System.out.println(myNum);

        int n = 130;
        byte nm =(byte) n;
        System.out.println(nm);

        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.length());

    }
}
