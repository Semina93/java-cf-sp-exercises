package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Πρόγραμμα κρυπτογράφησης και αποκρυπτογράφησης.
 */
public class ExerciseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        String s="";
        String encrypted="";
        String decrypted = "";

        do{
            System.out.println("Επιλέξτε 1 για κρυπτογράφηση ή 2 για αποκρυπτογράφηση:");
            choice = in.nextInt();
            in.nextLine();
        } while (choice < 1 || choice > 2);

        switch(choice){
            case 1:
                System.out.println("Εισάγεται λέξη για κρυπτογράφηση: ");
                s = in.nextLine();
                encrypted = encrypt(s);
                System.out.println("Κρυπτογραφημένη λέξη: " + encrypted);
            break;
            case 2:
                System.out.println("Εισάγεται λέξη για αποκρυπτογράφηση: ");
                s = in.nextLine();
                encrypted = decrypt(s);
                System.out.println("Αποκρυπτογραφημένη λέξη: " + decrypted);
            break;
            default:
                System.out.println("Λάθος επιλογή.");
        }
    }

    /**
     * Δέχεται μία συμβολοσειρά και την επιστρέφει κρυπτογραφημένη σε ASCII.
     *
     * @param s μεταβλητή string.
     * @return επιστρέφει τη συμβολοσειρά κρυπτοραφημένη σε ASCII.
     */
    public static String encrypt(String s){
        char c = ' ';
        StringBuilder encrypted =  new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            encrypted.append((char) (c+1));
        }
        return encrypted.toString();
    }

    /**
     * Δέχεται μια κρυπτογραφημένη συμβολοσειρά και την επιστρέφει αποκρυπτογραφημένη.
     * @param s η κρυπτογραφημένη συμβολοσειρά.
     * @return την αποκρυπτογραφημένη συμβολοσειρά.
     */

    public static String decrypt(String s){
        char c = ' ';
        StringBuilder decrypted =  new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            decrypted.append((char) (c-1));
        }
        return decrypted.toString();
    }
}
