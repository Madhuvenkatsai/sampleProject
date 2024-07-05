package Array;

public class EvenNum {
    public static void main(String args[]){
        int even[] ={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<=even.length-1;i++){
            if(even[i]%2==0){
                System.out.println(even[i]);
            }
        }

    }
}
