package LoopingStatements;

public class hallowTrainglePattern {
    public static void main(String args[]){
        int size=7;
        for(int i=1; i<=size; i++){
            for(int j=size; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                if(size==i){
                    System.out.print("*");
                }
                else if(k==1 || k==i*2-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
