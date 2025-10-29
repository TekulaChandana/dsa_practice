public class Factorial {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 6;
        int fact = factorial(n);
        System.out.println("Factorial of a give number is: " + fact);
    }
}
