package FOR_LOOP;
public class MirrorImageWithSpacesInMethods {
    public static void mirror() {
        int n = 5;
        int totalRows = 2 * n - 1;
        for (int i = 1; i <= totalRows; i++) {
            int starsInRow = (i <= n) ? i : totalRows - i + 1;
            int spacesBeforeStars = n - starsInRow;
            for (int j = spacesBeforeStars + 1; j < n; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= spacesBeforeStars * 2 + 1; j++) {
                System.out.print((j % 2 != 0) ? "*" : " ");
            }
            System.out.println();

        }
       // return n;
    }
    public static void main(String args[]){
        //System.out.println(mirror());
        mirror();
    }
}








