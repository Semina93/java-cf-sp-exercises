package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει n γραμμές με πρώτη γραμμή 1 star και aυξάνεται.
 * Ο χρήστης δίνει το πλήθος.
 */
public class StarsAscApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please insert number of stars: ");
        numberOfStars = in.nextInt();

        for (int i = 1; i <= numberOfStars; i++ ) {
            for (int j = 1; j<= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
