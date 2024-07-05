package package2;

public class stars {

    public void stars(int st){
        if(st>0){
            System.out.print("*");
            stars(st-1);
        }

    }
}
