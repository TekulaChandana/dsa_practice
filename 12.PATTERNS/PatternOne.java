import java.util.Scanner;

public class PatternOne {

    public static void left_aligned_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void invertedStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void halfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }

    public static void printCharacter(int n) {
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }

    }

    public static void main(String[] var0) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("\n Star Pattern: ");
        left_aligned_triangle(n);
        System.out.println("\n Inverted Star Pattern: ");
        invertedStar(n);
        System.out.println("\n Half Pyramid Pattern: ");
        halfPyramid(n);
        System.out.println("\n Print Character Pattern: ");
        printCharacter(n);
        sc.close();
    }
}