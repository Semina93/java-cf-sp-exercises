package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει έναν αριθμό από * και το πρόγραμμα τα εκτυπώνει οριζόντια.
 */
public class HorizontalStarsApp {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = 0;
        System.out.println("Please enter number of stars: ");
        n = in.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print("*");
        }
    }
}
