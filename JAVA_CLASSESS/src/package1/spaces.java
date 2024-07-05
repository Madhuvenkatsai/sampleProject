package package1;

import oopsPackage.constructors;

public class spaces {
 //   constructors c = new constructors();
       int n;

    public void space(int i){
        if(i >=0){
            System.out.print(" ");
            space(i -1);
        }

    }
}
class hello{
    spaces s = new spaces();
    int b = s.n;
}
