package Arrays;

public class forEach {
    public static void main(String args[]){
         int a[]={1, 4, 5 ,3, 6};
         for(int i : a){
             System.out.println(i);
             if(5==i){
                 System.out.println("found");
                 break;
             }

         }
    }
}
