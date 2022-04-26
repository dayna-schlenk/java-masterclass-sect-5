public class FirstAndLast {
    public int sumFirstAndLastDigit(int number) {
        if (number < 0){
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = number % 10; // take out last digit from number
        

        while (number != 0) { // as long as number still has digits
            firstDigit = number % 10; // find last digit

            number /= 10; // extract last digit from number and keep looping until condition is met
        }

        return firstDigit + lastDigit;
    }

    // ADDITIONAL SOLUTION FROM ANOTHER STUDENT
    public int studentSolution(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10; // stores the last digit in this variable

        while (number > 9) { // as long as the num is greater than 9, it means the number has at least 2 digits left & we need to keep looping
            
            number /= 10; // keep taking the last digit off until the condition is met
        }

        return lastDigit + number;
    }
}
