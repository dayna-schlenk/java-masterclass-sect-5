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
}
