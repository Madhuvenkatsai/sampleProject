package Array;
public class SecondLargestElementOfArray {
    public static void main(String args[] ) {
        int array[] = {21,6,84,35,4,56};
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println(largest);

    }
}

