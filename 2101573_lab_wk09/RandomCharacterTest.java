package Lab9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RandomCharacterTest {
    int lowerBound, upperBound, testChar;
    static final int numOfChars = 15;
    static final RandomCharacter rc = new RandomCharacter();

    @Test
    public void testGetRandomLowerCaseLetter() {
        lowerBound = 97; /* Inclusive */
        upperBound = 123; /* Exclusive */

        for (int i = 0; i < numOfChars; i++) {
            testChar = rc.getRandomLowerCaseLetter();
            assertTrue(testChar >= lowerBound && testChar < upperBound);
            assertFalse(testChar < lowerBound);
            assertFalse(testChar >= upperBound);
        }
    }

    @Test
    public void testGetRandomUpperCaseLetter() {
        lowerBound = 65; /* Inclusive */
        upperBound = 91; /* Exclusive */
        for (int i = 0; i < numOfChars; i++) {
            testChar = rc.getRandomUpperCaseLetter();
            assertTrue(testChar >= lowerBound && testChar < upperBound);
            assertFalse(testChar < lowerBound);
            assertFalse(testChar >= upperBound);
        }
    }

    @Test
    public void testGetRandomDigitCharacter() {
        lowerBound = 48; /* Inclusive */
        upperBound = 58; /* Exclusive */

        for (int i = 0; i < numOfChars; i++) {
            testChar = rc.getRandomDigitCharacter();
            assertTrue(testChar >= lowerBound && testChar < upperBound);
            assertFalse(testChar < lowerBound);
            assertFalse(testChar >= upperBound);
        }
    }

    @Test
    public void testGetRandomCharacter() {
        int lowerBound_lc = 97; /* Inclusive */
        int upperBound_lc = 123; /* Exclusive */
        int lowerBound_uc = 65; /* Inclusive */
        int upperBound_uc = 91; /* Exclusive */
        int lowerBound_dc = 48; /* Inclusive */
        int upperBound_dc = 58; /* Exclusive */
        for (int i = 0; i < numOfChars; i++) {
            testChar = rc.getRandomDigitCharacter();
            assertTrue((testChar >= lowerBound_lc && testChar < upperBound_lc) || (testChar >= lowerBound_uc && testChar < upperBound_uc) || (testChar >= lowerBound_dc && testChar < upperBound_dc));
            assertFalse(testChar < Math.min(lowerBound_lc, Math.min(lowerBound_uc, lowerBound_dc)));
            assertFalse(testChar >= Math.max(upperBound_lc, Math.max(upperBound_uc, upperBound_dc)));
        }
    }

    @Test
    public void testGetRandomPrimeDigitCharacter() {
        lowerBound = 48; /* Inclusive */
        upperBound = 58; /* Exclusive */
        for (int i = 0; i < numOfChars; i++) {
            testChar = rc.getRandomPrimeDigitCharacter();
            assertTrue(testChar >= lowerBound && testChar < upperBound);
            assertNotEquals(0, testChar - lowerBound);
            assertNotEquals(1, testChar - lowerBound);
            assertNotEquals(4, testChar - lowerBound);
            assertNotEquals(6, testChar - lowerBound);
            assertNotEquals(8, testChar - lowerBound);
            assertNotEquals(9, testChar - lowerBound);
        }
    }

    @Test
    public void testCheckPrime() {
        assertFalse(RandomCharacter.checkPrime(0), "0");
        assertFalse(RandomCharacter.checkPrime(1), "1");
        assertTrue(RandomCharacter.checkPrime(2), "2");
        assertTrue(RandomCharacter.checkPrime(3), "3");
        assertFalse(RandomCharacter.checkPrime(4), "4");
        assertTrue(RandomCharacter.checkPrime(5), "5");
        assertFalse(RandomCharacter.checkPrime(6), "6");
        assertTrue(RandomCharacter.checkPrime(7), "7");
        assertFalse(RandomCharacter.checkPrime(8), "8");
        assertFalse(RandomCharacter.checkPrime(9), "9");
    }
}
