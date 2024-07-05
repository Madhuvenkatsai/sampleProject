package Array;

public class ArraySumnAvg {
    public static void main(String args[]){
    int[] i= {11,42,63,14,15};
    int sum=0;
    for(int j=0;j<i.length;j++){
        sum = sum+i[j];
    }
    int avg = sum/i.length;
    System.out.println(sum);
        System.out.println(avg);
    }
}
