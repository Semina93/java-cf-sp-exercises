package gr.aueb.cf.ch6;
/**
 * Ζητάει από τον χρήστη να εισάγει 6 ακέραιους
 * από το 1 - 49 και ελέγχει αν η εξάδα περνάει από κάποια φίλτρα.
 */

import java.util.Scanner;

public class PredicatesExerciseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[6];

        System.out.println("Παρακαλώ εισάγεται έξι ακεραίους από το 1 εώς το 49:");
        for (int i = 0; i < 6; i++) {
            do {
                numbers[i] = in.nextInt();
            } while (numbers[i] < 1 || numbers[i] > 49);
        }

        if (checkEvenOdd(numbers) && !areSameEnding(numbers) && !areSameGroupOfTens(numbers) && moreThanThreeConsecutive(numbers)){
            System.out.println("Η εξάδα περνάει τα κριτήρια.");
        }else{
            System.out.println("Η εξάδα δεν περνάει τα κριτήρια.");
        }

    }

    /**
     * Ελέγχει εάν υπάρχουν πάνω από τρεις άρτιους και περιττούς.
     * @param numbers  ο πίνακας με τους αριθμούς.
     * @return true αν οι άρτιοι και οι περιττοί είναι μικρότεροι ίσοι του 3.
     */
    public static boolean checkEvenOdd(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;
        for (int item : numbers) {
            if (item % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return evenCount <= 3 && oddCount <= 3;
    }

    /**
     * Ελέγχει εάν υπάρχουν πάνω από τρεις αριθμοί με τον ίδιο λήγοντα.
     * @param numbers ο πίνακας με τους αριθμούς που έβαλε ο χρήστης.
     * @return true αν δεν υπάρχουν πάνω από 3 αριθμοί με τον ίδιο λήγοντα.
     */
    public static boolean areSameEnding (int[] numbers) {
        int[] endings = new int[10];
        boolean sameEnding = false;

        for(int item : numbers) {
            endings[item % 10]++;
        }
        for(int item : endings){
            if(item >= 3){
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }

    /**
     * Ελέγχει εάν υπάρχουν πάνω από τρεις αριθμοί στην ίδιο δεκάδα.
     * @param numbers ο πίνακας με τους αριθμούς που έβαλε ο χρήστης.
     * @return true αν δεν υπάρχουν πάνω από 3 αριθμοί που ανήκουν στην ίδια δεκάδα.
     */

    public static boolean areSameGroupOfTens (int[] numbers) {
        int[] tens = new int[99];
        boolean sameTen = false;

        for(int item : numbers) {
            tens[item / 10]++;
        }
        for(int item : tens){
            if(item >= 3){
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }

    /**
     * Ελέγχει τον πίνακα για το αν περιέχει περισσότερους
     * από 3 συνεχόμενους αριθμούς
     * @param numbers ο πίνακας με τους αριθμούς που έβαλε ο χρήστης.
     * @return true αν ο πίνακας δεν έχει πάνω από 3 συνεχόμενους αριθμούς.
     */
    public static boolean moreThanThreeConsecutive(int[] numbers) {
        if (numbers == null) return false;
        int cons = 0;
        for(int i = 0; i<numbers.length -3; i++) {
            if ((numbers[i] == numbers[i + 1] - 1) && (numbers[i] == numbers[1 + 3] - 3)) {
                cons++;
            }
        }
        return cons <= 3;
    }
}
