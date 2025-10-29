import java.util.Scanner;

public class PatternTwo {

    // Hollow Rectangle Pattern

    public static void hollow_Rectangle(Scanner sc) {

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    // Inverted & Rotated Half-Pyramid

    public static void inverted_rotated_half_pyramid(Scanner sc) {

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        // outer
        for (int i = 1; i <= num; i++) {
            // spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    // Inverted Half Pyramid with Numbers

    public static void inverted_half_pyramid_withNumbers(Scanner sc) {
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // FLOYD'S Triangle

    public static void floydsTriangle(Scanner sc) {
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int counter = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // 0-1 Triangle

    public static void zero_one_triangle(Scanner sc) {
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }

    // Butterfly Pattern
    public static void butterflyPattern(Scanner sc) {
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        // Upper Part
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Part
        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Solid Rhombus Pattern

    public static void solidRhombus(Scanner sc) {
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    // Diamond Pattern
    public static void diamondPattern(Scanner sc) {
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        // Upper Part
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Part
        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("HOLLOW RECTANGLE PATTERN:");
        // hollow_Rectangle(sc);
        // System.out.println(" Inverted & Rotated Half-Pyramid");
        // inverted_rotated_half_pyramid(sc);
        // System.out.println(" Inverted Half-Pyramid With Numbers");
        // inverted_half_pyramid_withNumbers(sc);
        // System.out.println(" Floyd's Triangle");
        // floydsTriangle(sc);
        // System.out.println(" 0-1 Triangle");
        // zero_one_triangle(sc);
        // System.out.println(" Butterfly Pattern");
        // butterflyPattern(sc);
        // System.out.println(" Solid Rhombus Pattern");
        // solidRhombus(sc);
        System.out.println("Diamond Pattern");
        diamondPattern(sc);
        sc.close();

    }
}
