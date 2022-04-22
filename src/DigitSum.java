// Loop through all digits in the number & add together

public class DigitSum {
    public int sumDigits(int number) {
        if (number >= 10) {
            int remainingNum = number;
            int LSD = 0;
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
}

// Least significant digit: the digit with the lowest exponent value, located in the farthest right position
