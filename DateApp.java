package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη 3 ακεραίους αριθμούς
 * και τους εμφανίζει με τη μορφή ΗΗ/ΜΜ/ΕΕ
 */
public class DateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please enter 3 integer numbers for day, month and year: ");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        year %= 100; // για να πάρει μόνο τα 2 τελευταία ψηφία σε περίπτωση που το έτος έχει μορφή ΕΕΕΕ

        System.out.printf("The date is: %02d/%02d/%02d\n", day, month, year);
    }
}
