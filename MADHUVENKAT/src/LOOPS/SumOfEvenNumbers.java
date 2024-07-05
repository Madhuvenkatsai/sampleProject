package LOOPS;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        do {
            if (i % 2 == 0) {
                sum += i; //sum=sum+i
            }
            i++;
        } while (i <= 10);
        System.out.println(sum);
    }
}
