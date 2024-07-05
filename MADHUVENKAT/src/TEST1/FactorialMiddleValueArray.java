package TEST1;

public class FactorialMiddleValueArray {
    public static void main(String args[]){
                int[] num = {1,2,3,4,5,6,7,8,9};
                int mid = num.length / 2;
                int midValue = num[mid];
                System.out.println(midValue);
//                for (int i=1;i<=num;i++) {
                     int factorial = 1;
                     int i =1;
                     do{
                         factorial *= i;
                         i++;
                         }while(i<=midValue);
                            System.out.println(factorial);

                }
            }


