package Array;

public class ArrayLargestNum {
            public static void main(String[] args) {
                int[] array = {30, 15, 8, 2, 79, 23, 45};
                int largest = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > largest) {
                        largest = array[i];
                    }
                }
                System.out.println(largest);
            }
        }