package conditionalStatements;

public class elseIfcondition {
    public static void main(String args[]){
        int a=285;
        int b= 40;
        int c = 60;
        if(a>b && a>c){
            System.out.println("a is big");
        }
        else if (b>c){
            System.out.println("b is big");

        }else{
            System.out.println("c is big");

        }
    }
}
