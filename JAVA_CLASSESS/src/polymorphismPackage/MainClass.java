package polymorphismPackage;

public class MainClass {
    public static void main(String args[]){
        parent p1 = new parent();
        parent ch1 = new child1();
        child2 ch2 = new child2();

        p1.Animal();
        ch1.Animal();
        ch2.Animal();
        ch2.m1();
    }
}
