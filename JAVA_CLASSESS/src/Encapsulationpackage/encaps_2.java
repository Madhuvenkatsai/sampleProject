package Encapsulationpackage;


public class encaps_2 {
    public void num(int n){
        System.out.println(n);
    }
    public static void main(String args[]){
        encaps_2 encap2 = new encaps_2();
        encaps_1 en = new encaps_1();

        en.setName("swathi");
        en.setRollNo(102);
        encap2.num(en.getRollNo());
        int rollnum = en.getRollNo();
        String name = en.getName();
        System.out.println(name+" "+en.getRollNo());

    }
}
