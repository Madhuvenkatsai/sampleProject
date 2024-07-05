package oopsPackage;

import package1.spaces;
import package2.stars;


public class diamondPattern {
    spaces s = new spaces();
    stars st = new stars();

    public void pattern(int rows,int start){
        int size = rows*2-1;
        if(start<=size){
            int sp = (start<=rows)? start : size-start+1;
            int spc = rows-sp;
             s.space(spc);
             st.stars(sp*2-1);
            System.out.println();
            pattern(rows,start+1);
        }
    }


    public static void main(String args[]){
        diamondPattern dp = new diamondPattern();
        constructors c = new constructors();

        dp.pattern(5,1);
    }
}
