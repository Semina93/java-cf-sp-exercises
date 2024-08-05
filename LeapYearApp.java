package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη ένα έτος από το πληκτρολόγιο
 * και εμφανίζει στην οθόνη εάν το έτος είναι δίσεκτο ή όχι.
 */
public class LeapYearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;

        System.out.println("Please enter a year: ");
        year = in.nextInt();

        if ( year % 400 ==0 || year % 4 ==0 && year % 100 != 0) {
            System.out.println("The year is a leap year.");
        }else {
            System.out.println("This is not a leap year.");
        }
    }
}
