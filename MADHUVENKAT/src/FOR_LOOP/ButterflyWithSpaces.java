package FOR_LOOP;

public class ButterflyWithSpaces {
        public static void main(String[] args) {
            int n = 6;
            for (int i = 1; i <= 2 * n; i++) {
                int currentRow = i <= n ? i : 2 * n - i + 1;
                for (int j = 1; j <= 2 * n; j++) {
                    System.out.print(j <= currentRow || j > 2 * n - currentRow ? "*" : " ");
                }
                System.out.println();
        }
    }

}

