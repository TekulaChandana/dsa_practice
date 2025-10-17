public class DecimalToBinary {

    public static int decimalBinary(int decNum) {

        while (decNum > 0) {
            int lastDigit = decNum % 2;
            decNum = decNum / 2;
            System.out.println(lastDigit);
        }
        return 0;
    }

    public static void main(String[] args) {
        int decNum = 121;
        decimalBinary(decNum);

    }
}
