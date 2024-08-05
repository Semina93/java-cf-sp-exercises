package gr.aueb.cf.ch6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Εμφανίζει έναν πίνακα και με μεθόδους αναζητά ένα στοιχείο και επιστρέφει τη θέση του,
 * φιλτράρει και εκτυπώνει τους ζυγούς, κάνει mapping κάθε στοιχείο του πίνακα με το διπλάσιο,
 * ελέγχει αν υπάρχει έστω ένας θετικός αριθμός,
 * ελέγχει αν όλα τα στοιχεία του πίνακα είναι θετικοί.
 */
public class ExerciseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        int value = 0;
        int position = 0;
        int[] mappedArray = mapDouble(arr);
        boolean positiveExists = isPositive(arr);

        do{
            System.out.println("Επιλέξτε ένα στοιχείο από το 1-6");
            value = in.nextInt();
        } while (value < 1  || value >6);

        position = getPosition(arr, value);

        System.out.printf("Ο αριθμός που αναζητάτε είναι το %d και η θέση που βρίσκεται είναι: %d\n", value, position+1);
        filterEven(arr);
        System.out.println();
        System.out.println("Ο πίνακας με το διπλάσιο των στοιχείων είναι: \n" + Arrays.toString(mappedArray));

        if (positiveExists) {
            System.out.println("Υπάρχει τουλάχιστον ένας θετικός αριθμός στον πίνακα.");
        } else {
            System.out.println("Δεν υπάρχει θετικός αριθμός στον πίνακα.");
        }

        if (isAllPositive(arr)) {
            System.out.println("Υπάρχει τουλάχιστον ένας θετικός αριθμός στον πίνακα.");
        } else {
            System.out.println("Δεν υπάρχει θετικός αριθμός στον πίνακα.");
        }

    }

    /**
     * Αναζητά ένα στοιχείο στον πίνακα και επιστρέφει τη θέση του.
     *
     * @param arr ο πίνακας
     * @param value το στοιχείο που αναζητάμε
     * @return Επιστρέφει τη θέση του στοιχείου αλλιώς επιστρέφει -1.
     */

    public static int getPosition (int[] arr, int value){

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    /**
     * Φιλτράρει τους ζυγούς και επιστρέφει μόνο την εκτύπωσή τους.
     *
     * @param arr ο πίνακας.
     */
    public static void filterEven (int[] arr){
        System.out.println("Οι ζυγοί αριθμοί του πίνακα είναι:");

        for (int item : arr) {
            if (item % 2 == 0) {
                System.out.print(item + " ");
            }
        }
    }

    /**
     * Κάνει mapping κάθε στοιχείο του πίνακα με το διπλάσιο.
     *
     * @param arr ο πίνακας.
     * @return έναν πίνακα με το διπλάσιο.
     */
    public static int[] mapDouble(int[] arr) {
        int[] arrayToReturn = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            arrayToReturn[i] = arr[i] * 2;
        }
        return arrayToReturn;
    }

    /**
     * Ελέγχει αν υπάρχει έστω και ένας θετικός αριθμός.
     * @param arr ο πίνακας.
     * @return αν ο πίνακας έχει έστω και έναν θετικό.
     */
    public static boolean isPositive (int[]arr){
        boolean isPositive = false;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > 0 ){
                isPositive = true;
                break;
            }
        }
        return isPositive;
    }

    /**
     * Ελέγχει αν όλα τα στοιχεία είναι θετικοί αριθμοί.
     * @param arr ο πίνακας.
     * @return αν ο πίνακας έχει όλα τα στοιχεία θετικά.
     */
    public static boolean isAllPositive (int[]arr){
        boolean isPositive = false;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > 0 ){
                isPositive = true;
            }
        }
        return isPositive;
    }
}
