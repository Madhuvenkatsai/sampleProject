public class Palindrome {
    public static void main(String args[]){
        int a;int b=121;int c=0;
        int temp = b;
        while(b>0){
            a=b%10;
            c=c*10+a;
            b=b/10;
        }
        System.out.println(c);
        if(temp == c){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");

        }
    }
}
