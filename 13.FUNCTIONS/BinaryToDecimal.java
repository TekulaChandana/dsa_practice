public class BinaryToDecimal {

    public static int binaryDecimal(int binNum) {
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * Math.pow(2, pow);

            pow++;
            binNum = binNum / 10;
        }
        return decNum;
    }

    public static void main(String[] args) {
        int binNum = 1000;
        System.out.println("Decimal number is :" + binaryDecimal(binNum));
    }
}
