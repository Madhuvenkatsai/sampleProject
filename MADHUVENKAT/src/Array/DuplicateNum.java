package Array;

public class DuplicateNum {
    public static void main(String args[]){
        int array[] = { 12,11,31,71,32,31,11};
        int duplicate = array[0];
        for(int i=0;i<array.length;i++){
            if (array[i] < duplicate) {
                duplicate = array[i];
            }
        }
        System.out.println(duplicate);
    }
}
