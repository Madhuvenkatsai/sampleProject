package LOOPS;

public class ArmstrongNum {
    public static void main(String args[]){
        int num=156,i,sum=0,rem=0;
        i=num;
        while(num!=0){
            rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }
        if(i == sum){
            System.out.println("ArsNum");
        }else{
            System.out.println("not ArsNum");
        }
    }
}
