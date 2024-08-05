package gr.aueb.cf.ch7;

/**
 * Demo of IndexOf() and substring()
 */
public class IndexOfSubstringApp {
    public static void main(String[] args) {
        String s = "Coding factory";

        int positionOfO = s.indexOf('o'); //μπορεί να πάρει είτε char είτε string. Δίνει την πρώτη εμφάνιση.
        int positionOfNextO = s.indexOf("o", 2);
        System.out.println("Position of o: " + positionOfO);
        System.out.println("Position of o: " + positionOfNextO);

//        String odToEnd = s.substring(1);
//        System.out.println(odToEnd);
//
//        String od = s.substring(1,3);
//        System.out.println(od);
    }
}
