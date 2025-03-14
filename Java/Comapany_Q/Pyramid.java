package Comapany_Q;

public class Pyramid {
    public static void main(String[] args) {
        int a = 5;
        half_Pyramid(a);
        full_Pyramid(a);
        half_Pyramid(a);
    }

    private static void half_Pyramid(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = a; i > 0; i--) {
            for (int j = a; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = a - 1; i > 0; i--) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void full_Pyramid(int a) {
        int k = 0;
        for (int i = 1; i <= a; ++i, k = 0) {
            for (int j = 1; j <= a - i; ++j) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < (a * 2 - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = a; i > 0; --i) {
            for (int j = 1; j <= a - i; ++j) {
                System.out.print("  ");
            }
            for (int j = i; j <= (i * 2 - 1); ++j) {
                System.out.print("* ");
            }
            for (int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}