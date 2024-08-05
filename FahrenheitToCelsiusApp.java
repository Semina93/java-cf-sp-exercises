package gr.aueb.cf.ch2;
/**
 * Λαμβάνει θερμοκρασία σε Fahrenheit
 * και τη μετατρέπει σε Celsius
 */

import java.util.Scanner;

public class FahrenheitToCelsiusApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int FAHRENHEIT_TO_CELSIUS;
        int fahrenheit = 0;
        int celsius = 0;

        System.out.print("Please enter temperature in Fahrenheit: ");
        fahrenheit = in.nextInt();

        FAHRENHEIT_TO_CELSIUS = (int) (5.0 * (fahrenheit - 32) / 9);
        celsius = FAHRENHEIT_TO_CELSIUS;

        System.out.printf("Temperature in Celsius is: %d\n", celsius);
    }
}
