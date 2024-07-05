package Arrays;

public class sorting {
    public static void main(String args[]){
        int a[]={7, 8 , 6 , 4, 1, 0};
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[j]<=a[i]){
                  int  temp = a[i];
                  a[i]=a[j];
                  a[j]=temp;

                }
            }
        }
//        for(int i:a ){
//            System.out.println(i);
//        }
        System.out.println(a[1]) ;
    }
}
