package Array;

public class CommonElementsInString {
    public static void main(String args[]) {
        String array1[] = {"hello", "world", "of", "java"};
        String array2[] = {"hi", "world", "of", "java"};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 1; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}