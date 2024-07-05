package oopsPackage;

import methods.LeftTraingle;

public class OOPS {
    int num = 5;
    public void m1(){
        System.out.println("m1");
    }
    public static void main(String args[]){
        OOPS obj = new OOPS();
        LeftTraingle traingle = new LeftTraingle();

        traingle.lefttraingle(5,1);
        obj.m1();
        int n = obj.num;

    }
}
