package Array;

public class ArraySmallestNum {
        public static void main(String[] args) {
            int[] array= {48, 50, 8, 28, 9, 23, 4};
            int smallest = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                }
            }
                System.out.println(smallest);
            }
        }

