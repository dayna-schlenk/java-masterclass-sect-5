public class NumPalindrome {
    public boolean isPalindrome(int number) {
        int reverse = 0;

        // Run loop until number becomes 0
        while (number != 0) {
            // get last digit from number
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;

            // remove last digit from number
            number /= 10;
        }

        // Determine if number is equal to reverse variable & return
        return (number == reverse);
    }
}
