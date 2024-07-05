package TEST1;

public class CalculatorUSingSwitch {
            public static void main(String[] args) {
                char operation = '+';
                double num1 = 23;
                 double num2 = 7;
                 double result = 0;
                boolean Operation = true;
                switch (operation) {
                    case  '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Error");
                        Operation = false;
                        break;
                }
                if (Operation) {
                    System.out.println(num1 + " " + operation + " " + num2 + "  " + result);
                }
            }
        }

