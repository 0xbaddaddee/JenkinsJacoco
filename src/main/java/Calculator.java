public final class Calculator {
    private Calculator() {}

    public static int divide(int a, int b) {
        int result = a / b;
        boolean resultWasPositive = false;
        if (result < 0)
            System.out.println("Negative result: " + result);
        else {
            System.out.println("Positive result: " + result);
        }
        return result;
    }
}
