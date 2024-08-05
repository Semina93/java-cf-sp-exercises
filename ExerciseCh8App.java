package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Εμφανίζεται ένα μενού με επιλογές από 1-4 και 5 για έξοδο.
 * Διαβάζει με την int getCoice() την επιλογή του χρήστη και ελέγχει με κατάλληλα
 * state-testing την επιλογή του χρήστη. Εκτυπώνει την επιλογή και δημιουργεί ένα
 * IllegalArgumentException αν η επιλογή του χρήστη δεν είναι ανάμεσα στο 1-5.

 */
public class ExerciseCh8App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        do {
            PrintMenu();
            choice = getChoice();
            try {
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Σφάλμα: " + e.getMessage());
                System.out.println("Παρακαλώ εισάγετε έναν έγκυρο αριθμό μεταξύ 1 και 5.");
                continue;
            }
            break;
        } while (true);
        in.close();
    }

    public static void PrintMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Επιλογή πρώτη");
        System.out.println("2. Επιλογή δεύτερη");
        System.out.println("3. Επιλογή τρίτη");
        System.out.println("4. Επιλογή τέταρτη");
        System.out.println("5. Έξοδος");
    }

    public static int getChoice() {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Εισαγάγετε έναν ακέραιο αριθμό:");

            if (in.hasNextInt()) {
                choice = in.nextInt();
                break;
            } else {
                System.out.println("Μη έγκυρη είσοδος. Παρακαλώ εισαγάγετε έναν ακέραιο αριθμό.");
                in.nextLine();
            }
        }
        return choice;
    }

    public static void printChoice(int choice) {
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException("Μη έγκυρη επιλογή. Η επιλογή πρέπει να είναι από 1 έως 5.");
        } else {
            System.out.println("Η επιλογή που κάνατε είναι: " + choice);
        }
    }
}
