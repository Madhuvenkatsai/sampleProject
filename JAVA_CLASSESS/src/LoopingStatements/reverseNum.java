package LoopingStatements;

public class reverseNum {
    public static void main(String args[]){
        int rem, res=0, n=234;
        while(n>0){
            rem = n%10; 
            res = res * 10 +rem;
            n = n/10;
        }
        System.out.println(res);
    }
}
