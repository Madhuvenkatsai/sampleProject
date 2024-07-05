package FOR_LOOP;

public class HallowTriangle {
        public static void main(String[] args) {
            int height = 10;

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < height * 2 - 1; j++) {
                    if (i == height - 1 || j == height - 1 - i || j == height - 1 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }



