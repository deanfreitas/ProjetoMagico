package br.com.projetomagico;

public class Utils {

    public static boolean isNegativeNumber(int number) {
        return number < 0;
    }

    public static boolean isEndGreaterStart(Interval interval) {
        return interval.getEnd() >= interval.getStart();
    }

    public static boolean isSquareRootValidEndPrime(int number) {
        double squareRoot = Math.sqrt(number);
        return ((squareRoot - Math.floor(squareRoot)) == 0) && isPrimeNumbers(squareRoot);
    }

    public static boolean isPrimeNumbers(double number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
