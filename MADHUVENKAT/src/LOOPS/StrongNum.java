package LOOPS;

public class StrongNum {
    public static void main(String args[]){
        int num=145,rem,res=0, temp;
        temp=num;

        while(num>0){
            rem=num%10;
            int i=1, fact =1;
            while(i<=rem){
                fact = fact*i;
                i++;

            }
           res = res+fact;
            num=num/10;
        }
        System.out.println(res);

        if(temp==res){
            System.out.println("strong");
        }else{
            System.out.println("not strong");
        }



    }
}
