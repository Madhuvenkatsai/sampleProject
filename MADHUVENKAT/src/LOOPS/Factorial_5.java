package LOOPS;

public class Factorial_5 {
    public static void main(String args[]){
        int num = 5;
        int factorial = 1;
        int i =1;
        do{
           factorial *= i;
            i++;
        }while(i<=num);
        System.out.println(factorial);
    }
}
