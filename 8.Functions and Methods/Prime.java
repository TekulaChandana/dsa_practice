public class Prime {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeOptimized(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Primes in Range

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrimeOptimized(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // if (isPrimeOptimized(8)) {
        // System.out.println("Prime");
        // } else {
        // System.out.println("Not a Prime");
        // }
        primesInRange(10);
    }
}