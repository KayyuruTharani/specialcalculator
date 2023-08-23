public class SpecialCal {
    private boolean normalMode;

    public SpecialCal() {
        normalMode = true;
    }

    public void switchMode() {
        normalMode = !normalMode;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int calculate(String operation, int a, int b) {
        if (operation.equals("add")) {
            return normalMode ? add(a, b) : subtract(a, b);
        } else if (operation.equals("subtract")) {
            return normalMode ? subtract(a, b) : add(a, b);
        } else {
            System.out.println("Invalid operation");
            return 0;
        }
    }

    public int calculate(String operation, int a, int b, int c) {
        if (operation.equals("add")) {
            return normalMode ? add(a, b) + c : subtract(a, b) + c;
        } else if (operation.equals("subtract")) {
            return normalMode ? subtract(a, b) + c : add(a, b) + c;
        } else {
            System.out.println("Invalid operation");
            return 0;
        }
    }

    public static void main(String[] args) {
        SpecialCal calculator = new SpecialCal();

        // Perform addition in Normal mode
        int result1 = calculator.calculate("add", 10, 5);
        System.out.println(result1);  // Output: 15

        // Switch to Opposite mode
        calculator.switchMode();

        // Perform subtraction in Opposite mode
        int result2 = calculator.calculate("subtract", 10, 5);
        System.out.println(result2);  // Output: 5 (because in Opposite mode, subtraction is like addition)
    }
}
