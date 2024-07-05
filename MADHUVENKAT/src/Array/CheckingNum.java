package Array;

public class CheckingNum {
    public static void main(String args[]){
        int array[] = {20,10,90,70,190};
       int check = 950;
          boolean found=false;

       for(int i = 0; i<array.length;i++){
           if(array[i] == check){
               found = true;
               break;
           }
       }
       if(found) {
           System.out.println("given number is in array");
       }else{
           System.out.println("given number is not in array");

       }

    }
}
