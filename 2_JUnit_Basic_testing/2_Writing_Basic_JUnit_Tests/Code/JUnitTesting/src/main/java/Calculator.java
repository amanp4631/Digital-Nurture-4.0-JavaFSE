public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }
    
    public boolean isNegative(int number) {
        return number < 0;
    }
    
    public boolean isZero(int number) {
        return number == 0;
    }
}