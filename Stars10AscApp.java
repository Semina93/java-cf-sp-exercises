package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 γραμμές με πρώτη γραμμή 1 star και aυξάνεται.
 *
 */
public class Stars10AscApp {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++ ) {
            for (int j = 1; j<= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
