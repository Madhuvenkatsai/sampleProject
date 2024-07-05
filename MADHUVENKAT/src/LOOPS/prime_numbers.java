package LOOPS;

public class prime_numbers {
    public static void main(String[] args) {
        int c = 2;
        for(int i=1; i<=10; i++){
            if(i%10 == 0){
                c = c++;
            }
        }
        if(c == 2){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}