package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού με 6 επιλογές.
 * Κάθε μία πό τις πέντε πρώτες επιλογές υλοποιείται με μία μέθοδο.
 * Η 3η, 4η και 5η μέθοδος υλοποιούνται με τη βοήθεια της πρώτης μεθόδου.
 * Η 6η επιλογή οδηγεί σε έξοδο από το πρόγραμμα.
 * Ο χρήστης δίνει τον αριθμό με τα στεράκια που θέλει να εμφανίσει.
 */
public class MethodExerciseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int n = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με 1-n αστεράκια");
            System.out.println("5. Εμφάνισε n γραμμές με n-1 αστεράκια");
            System.out.println("6. Exit");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please enter number of stars: ");
                    n = in.nextInt();
                    horizontalStars (n);
                    break;
                case 2:
                    System.out.println("Please enter number of stars: ");
                    n = in.nextInt();
                    verticalStars (n);
                    break;
                case 3:
                    System.out.println("Please enter number of stars: ");
                    n = in.nextInt();
                    horizontalVerticalStars (n);
                    break;
                case 4:
                    System.out.println("Please enter number of stars: ");
                    n = in.nextInt();
                    starsAsc (n);
                    break;
                case 5:
                    System.out.println("Please enter number of stars: ");
                    n = in.nextInt();
                    starsDesc (n);
                    break;
                case 6:
                System.out.println("Exit");
                break;
                default:
                    System.out.println("Error in choice");
                    break;
            }

        } while (choice != 6);
        System.out.println("Thank you for playing the game.");
    }

    /**
     * Εμφανίζει αστεράκια οριζόντια.
     * @param n  Ο αριθμός των αστεριών που θέλει να εμφανίσει ο χρήστης.
     */
    public static void horizontalStars (int n){
        for (int i = 1; i <=n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Εμφανίζει αστεράκια κάθετα.
     * @param n  Ο αριθμός των αστεριών που θέλει να εμφανίσει ο χρήστης.
     */

    public static void verticalStars (int n){
        for(int i = 1; i <= n; i++){
            System.out.println("*");
        }
        System.out.println();
    }

    /**
     * Εκτυπώνει n γραμμές με n αστεράκια σε κάθε γραμμή, με τη βοήθεια της horizontalStars();.
     * @param n Ο αριθμός των αστεριών που θέλει να εμφανίσει ο χρήστης.
     */

    public static void horizontalVerticalStars (int n){
        for (int i = 1; i<=n; i++){
            horizontalStars (n);
        }
    }

    /**
     * Εκτυπώνει n γραμμές με πρώτη γραμμή 1 αστεράκι και μετά ο αριθμός αυξάνεται, με τη βοήθεια της horizontalStars();.
     * @param n  Ο αριθμός των αστεριών που θέλει να εμφανίσει ο χρήστης.
     */

    public static void starsAsc (int n){
        for (int i = 1; i<=n; i++){
            horizontalStars (i);
        }
    }
    /**
     * Εκτυπώνει n γραμμές με πρώτη γραμμή n αστεράκια και μετά ο αριθμός μειώνεται, με τη βοήθεια της horizontalStars();.
     * @param n  Ο αριθμός των αστεριών που θέλει να εμφανίσει ο χρήστης.
     */
    public static void starsDesc (int n){
        for (int i = n; i >= 1 ; i--) {
            horizontalStars (i);
        }
    }
}
