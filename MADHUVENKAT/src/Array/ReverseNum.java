package Array;

public class ReverseNum {
    public static void main(String args[]){
     int array[] ={11,22,33,55,66,76,86,96};

            int end = array.length - 1;
            for(int start=0; start<array.length/2; start++){
                int temp = array[start];
                array[start] = array[end-start];
                array[end-start] = temp;

     }
            for(int i: array){
                System.out.println(i);
            }
        // without using swap
      /*  for(int i=array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }*/
    }
}
