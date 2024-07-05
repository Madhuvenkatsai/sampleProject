package IF_CONDITIONS_WORK;

public class SmallestOfThree_numbers {
    public static void main(String args[]){
        int a = 51;
        int b = 66;
        int c = 19;
        if(a<b && a<c){
            System.out.println("a is small");
        }else if(b<c){
            System.out.println("b is small");
        }else{
            System.out.println("c is small");
        }
    }

}
