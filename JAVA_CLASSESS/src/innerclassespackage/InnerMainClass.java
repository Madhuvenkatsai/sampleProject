package innerclassespackage;

public class InnerMainClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        System.out.println(myOuter.x);
        OuterClass.InnerClass myin = myOuter.new InnerClass();

        OuterClass.InnerClass.subIn mysub = myin.new subIn();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
