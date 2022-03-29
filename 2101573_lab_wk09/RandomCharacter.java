package Lab9;

import java.util.Random;

public class RandomCharacter {
    Random r = new Random();
    int lowerBound, upperBound;

    public RandomCharacter() {
    }

    /* Generate a random lowercase letter */
    public char getRandomLowerCaseLetter() {
        lowerBound = 97; /* Inclusive */
        upperBound = 123; /* Exclusive */
        return (char) (r.nextInt(upperBound - lowerBound) + lowerBound);
    }

    /* Generate a random uppercase letter */
    public char getRandomUpperCaseLetter() {
        lowerBound = 65; /* Inclusive */
        upperBound = 91; /* Exclusive */
        return (char) (r.nextInt(upperBound - lowerBound) + lowerBound);
    }

    /* Generate a random digit character */
    public char getRandomDigitCharacter() {
        lowerBound = 48; /* Inclusive */
        upperBound = 58; /* Exclusive */
        return (char) (r.nextInt(upperBound - lowerBound) + lowerBound);
    }

    /* Generate a random character - lowercase / uppercase / digit */
    public char getRandomCharacter() {
        int choice = r.nextInt(3);
        switch (choice) {
            case 0:
                return this.getRandomLowerCaseLetter();
            case 1:
                return this.getRandomUpperCaseLetter();
            case 2:
                return this.getRandomDigitCharacter();
            default:
                return '\0';
        }
    }

    /* Generate a random prime digit character */
    public char getRandomPrimeDigitCharacter() {
        lowerBound = 48; /* Inclusive */
        upperBound = 58; /* Exclusive */
        char primeChar;
        do {
            primeChar = (char) (r.nextInt(upperBound - lowerBound) + lowerBound);
        } while (!checkPrime(primeChar - lowerBound));
        return primeChar;
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RandomCharacter rc = new RandomCharacter();
        int numOfChars = 15;

        System.out.print("Here are the " + numOfChars + " random lower case letters:");
        /* Run for loop for numOfChars times */
        for (int i = 0; i < numOfChars; i++) {
            System.out.print(" " + rc.getRandomLowerCaseLetter());
        }

        System.out.print("\nHere are the " + numOfChars + " random upper case letters: ");
        /* Run for loop for numOfChars times */
        for (int i = 0; i < numOfChars; i++) {
            System.out.print(" " + rc.getRandomUpperCaseLetter());
        }

        System.out.print("\nHere are the " + numOfChars + " random digit characters: ");
        /* Run for loop for numOfChars times */
        for (int i = 0; i < numOfChars; i++) {
            System.out.print(" " + rc.getRandomDigitCharacter());
        }

        System.out.print("\nHere are the " + numOfChars + " random characters: ");
        /* Run for loop for numOfChars times */
        for (int i = 0; i < numOfChars; i++) {
            System.out.print(" " + rc.getRandomCharacter());
        }

        System.out.print("\nHere are the " + numOfChars + " random prime digit characters: ");
        /* Run for loop for numOfChars times */
        for (int i = 0; i < numOfChars; i++) {
            System.out.print(" " + rc.getRandomPrimeDigitCharacter());
        }
    }
}
