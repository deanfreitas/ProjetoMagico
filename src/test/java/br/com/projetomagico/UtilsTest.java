package br.com.projetomagico;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {

    @Test
    public void isNegativeNumberShouldAnswerWithTrue() {
        Assert.assertTrue(Utils.isNegativeNumber(-2));
    }

    @Test
    public void isNegativeNumberShouldAnswerWithFalse() {
        Assert.assertFalse(Utils.isNegativeNumber(2));
    }

    @Test
    public void isEndGreaterStartShouldAnswerWithTrue() {
        Interval interval = new Interval(2, 3);
        Assert.assertTrue(Utils.isEndGreaterStart(interval));
    }

    @Test
    public void isEndGreaterStartShouldAnswerWithFalse() {
        Interval interval = new Interval(3, 2);
        Assert.assertFalse(Utils.isEndGreaterStart(interval));
    }

    @Test
    public void isSquareRootValidEndPrimeShouldAnswerWithTrue() {
        Assert.assertTrue(Utils.isSquareRootValidEndPrime(49));
    }

    @Test
    public void isSquareRootValidEndPrimeShouldAnswerWithFalse() {
        Assert.assertFalse(Utils.isSquareRootValidEndPrime(3));
    }

    @Test
    public void isPrimeNumbersShouldAnswerWithTrue() {
        Assert.assertTrue(Utils.isPrimeNumbers(2));
    }

    @Test
    public void isPrimeNumbersShouldAnswerWithFalse() {
        Assert.assertFalse(Utils.isPrimeNumbers(9));
    }
}
