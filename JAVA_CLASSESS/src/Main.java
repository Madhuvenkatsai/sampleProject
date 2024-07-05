import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
/*        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        for (int i = 1; i <= number; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Main.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }

        public static void solve(double meal_cost, int tip_percent, int tax_percent) {
            // Write your code here
            double tip = (tip_percent*meal_cost)/100;
            System.out.println(tip);
            double tax = (tax_percent*meal_cost)/100;
            System.out.println(tax);
            double total = meal_cost+tip+tax;
            System.out.println(total);
            double t = Math.round(total);
            System.out.println(t);


       }

}
