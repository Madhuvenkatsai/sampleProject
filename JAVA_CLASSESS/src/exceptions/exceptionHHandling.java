package exceptions;

public class exceptionHHandling {
    public static void main(String args[]){
        int[] a = {1,2,3};
        try{
            System.out.println(a[2]);
        }catch(Exception e){
           System.out.println(e.getMessage());
        }finally{
            System.out.println("task completed");
        }

        System.out.println("hello");
    }
}
