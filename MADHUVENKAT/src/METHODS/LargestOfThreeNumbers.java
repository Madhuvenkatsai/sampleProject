package METHODS;

public class LargestOfThreeNumbers {
    public static void main(String args[]) {
        findLargest(16,2,39);
    }
        public static void findLargest ( int a, int b, int c){

            if (a>b && a>c) {
                System.out.println(a);
            }
            else if (b>c) {
                System.out.println(b);

            }else{
                System.out.println(c);
            }

        }
    }


