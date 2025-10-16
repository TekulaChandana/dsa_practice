public class CheckEven {
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 9;
        System.out.println(isEven(num));
    }
}
