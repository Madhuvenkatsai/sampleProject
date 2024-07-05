package Inheritance;

public class inheritClass2 extends inheritClass1{
    int n = 100;
    // String name = "madhu";

    public static void main(String args[]){
        inheritClass2 inherit = new inheritClass2();
        inherit.m2();
        System.out.println(inherit.name);
    }
}
