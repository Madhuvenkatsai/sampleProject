package TEST1;

public class SortingOfDescending {
    public static void main(String args[]) {
                int[] arr = {51,21,9,6,3};
                for (int i =0; i<arr.length/2; i++) {
                    int temp = arr[i];
                    arr[i] = arr[arr.length-1-i];
                    arr[arr.length-1-i]=temp;
                }
                System.out.println("descending");
                for (int num : arr){
                    System.out.print(num + " ");
                }
            }
        }
