package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει n γραμμές με πρώτη γραμμή n stars και μειώνεται.
 * Ο χρήστης δίνει το πλήθος.
 */
public class StarsDescApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please insert number of stars: ");
        numberOfStars = in.nextInt();

        for (int i = 1; i <= numberOfStars; i++ ) {
            for (int j = numberOfStars; j >= i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
