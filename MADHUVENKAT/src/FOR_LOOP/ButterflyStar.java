package FOR_LOOP;

public class ButterflyStar {
    public static void main(String args[]) {
                int n = 4;
                int totalrows = 2*n-1;
                for (int i=1; i<=totalrows;i++) {
                    int star = (i<=n) ? i : totalrows -i +1;
                    int stars = n-star;
                    for (int j=stars;j<n;j++) {
                        if (i%2!=0){
                            String s = (j%2==0) ? "-" : "*";
                            System.out.print(s);
                        }else{
                            String s = (j%2==0) ? "-" : "*";
                            System.out.print(s);
                        }


                    }
                    for(int k=1; k<=totalrows-star; k++){
                        if(k>=stars*2){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }

            }
        }
