package FOR_LOOP;

public class HallowReverseTriangle {
        public static void main(String[] args) {
            int size = 7;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == j || j == size - 1 - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}
