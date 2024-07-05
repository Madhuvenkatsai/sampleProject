package LoopingStatements;

public class primeNum {
    public static void main(String args[]){
        int n=50, count=0, i=1;
        while(i<=n){
            if(n%i==0){
                count = count+1;
            }
            i++;

        }
        if(count == 2){
            System.out.println("given number is prime number");
        }else{
            System.out.println("given number is not prime number");

        }
    }
}
