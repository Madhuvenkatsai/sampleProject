package oopsPackage;

public class constructors {
      int a=67,b=90;
     String name;
    public constructors(int a, int b, String name){
        this.a=a;
        this.b = b;
        this.name = name;
    }
    public constructors(){

    }

        public static void main(String args[]){
        constructors cn = new constructors(68, 77, "hjj");
        constructors cd = new constructors(89, 78, "hmj");
        System.out.println(cn.a +" "+cn.b+" "+cn.name);
        System.out.println(cd.a);

        }
}
