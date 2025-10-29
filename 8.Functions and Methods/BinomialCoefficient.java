public class BinomialCoefficient {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoefficient(int n, int r) {
        int binCoeff = factorial(n) / (factorial(r) * factorial(n - r));
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binomialCoefficient(6, 2));
    }
}
