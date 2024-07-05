package Array;

public class commonElementsInTwoArrays {
        public static void main(String args[]) {
            int arr1[] = {12,24,43,89,5};
            int arr2[] = {32,14,5,43,77};
            for (int i=0;i<arr1.length;i++) {
                for (int j=0;j<arr2.length;j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.println(arr1[i]);
                    }
                }
        }
    }
}
