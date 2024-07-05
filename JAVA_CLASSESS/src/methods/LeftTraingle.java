package methods;

public class LeftTraingle {
    defaultValues df = new defaultValues();
    public  void lefttraingle(int rows, int st){
        if(rows>0){
            spaces(rows);
            df.stars(st);
            System.out.println();
            lefttraingle(rows-1, st+1);
        }
    }
    public  void spaces(int i){
        if(i>1){
            System.out.print("-");
            spaces(i-1);
        }
    }
    /*public  void stars(int i){
        if(i>0){
            System.out.print("*");
            stars(i-1);
        }
    }*/

    public static void main(String args[]){
        LeftTraingle traingle = new LeftTraingle();
      traingle.lefttraingle(5,1);
    }
}
