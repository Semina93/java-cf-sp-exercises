package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει n γραμμές με n αστεράκια σε κάθε γραμμή.
 * Τον αριθμό των γραμμών και των αστεριών τον δίνει ο χρήστης.2
 */
public class HorizontalVerticalStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfRows = 0;
        int numberOfStars = 0;

        System.out.println("Please enter number of rows: ");
        numberOfRows = in.nextInt();

        System.out.println("Please enter number of stars: ");
        numberOfStars = in.nextInt();

        for (int i = 1; i<=numberOfRows; i++){

            for(int j = 1; j<=numberOfStars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
