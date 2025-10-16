public class DecimalToBinary {

    public static int decimalBinary(int decNum) {

        while (decNum > 0) {
            int lastDigit = decNum % 2;
            decNum = decNum / 2;
        }
    }

    public static void main(String[] args) {
        int decNum = 121;

    }
}
