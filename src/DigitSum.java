// Loop through all digits in the number & add together

public class DigitSum {
    // MY SOLUTION
    public int sumDigits(int number) {
        if (number >= 10) {
            int remainingNum = number;
            int LSD = 0; // Least Significant Digit
            int solution = 0;

            while (remainingNum != 0) {
                LSD = remainingNum % 10;
                solution += LSD;
                remainingNum /= 10;
            }

            return solution;
        }

        return -1;
    }

    // INSTRUCTOR'S SOLUTION
    public int instructorSumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}

// Least significant digit: the digit with the lowest exponent value, located in the farthest right position

// HOW I GOT TO ABOVE SOLUTION:
// int solution = 0;

// int testNum = 123;
// System.out.println("Original test num: " + testNum);

// int LSD = testNum % 10;
// System.out.println("LSD num " + LSD);
// solution += LSD;

// testNum = testNum / 10;
// System.out.println("Discarded: " + testNum);

// LSD = testNum % 10;
// System.out.println("Updated LSD: " + LSD);
// solution += LSD;

// testNum = testNum / 10;
// System.out.println("Updated discarded: " + testNum);

// LSD = testNum % 10;
// System.out.println("Updated LSD: " + LSD);
// solution += LSD;

// System.out.println("Solution: " + solution);
