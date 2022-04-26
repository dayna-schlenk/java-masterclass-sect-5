public class App {
    public static void main(String[] args) throws Exception {
        // SWTICH STATEMENT PRACTICE
        // int switchValue = 13;

        // switch (switchValue) {
        //     case 1:
        //         System.out.println("Value is 1");
        //         break;
        //     case 2:
        //         System.out.println("Value is 2");
        //         break;
        //     case 3:case 4:case 5: // shortcut
        //         System.out.println("Value is either 3, 4, or 5");
        //         break;
        //     default: // aka, "else"
        //         System.out.println("Value is not 1 through 5");
        //         break;
        // }

        // char grade = 'A';

        // switch (grade) {
        //     case 'A':
        //         System.out.println("Your grade is A");
        //         break;
        //     case 'B':
        //         System.out.println("Your grade is B");
        //         break;
        //     case 'C':
        //         System.out.println("Your grade is C");
        //         break;
        //     case 'D':
        //         System.out.println("Your grade is D");
        //         break;
        //     case 'E':
        //         System.out.println("Your grade is E, somehow?");
        //         break;
        //     default:
        //         System.out.println("No grade found");
        //         break;
        // }

        // String month = "January";

        // switch (month.toLowerCase()) {
        //     case "january":
        //         System.out.println("This is in the winter.");
        //         break;
        //     case "april":
        //         System.out.println("This is in the spring.");
        //         break;
        //     case "june":
        //         System.out.println("This is in the summer.");
        //         break;
        //     case "october":
        //         System.out.println("This is in the fall.");
        //         break;
        //     default:
        //         System.out.println("Enter a different month.");
        //         break;
        // }


        // FOR LOOP PRACTICE
        // System.out.println("10,000 at 2% interest = " + calcInterest(10000.0, 2.0));

        // for (int i = 2; i < 9; i++) {
        //     System.out.println("10,000 at " + i + "% interest = " + String.format("%.1f", calcInterest(10000.0, i)));
        // }

        // for (int i = 8; i > 1; i--) {
        //     System.out.println("10,000 at " + i + "% interest = " + String.format("%.1f", calcInterest(10000.0, i)));
        // }

        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Hello, loop " + i);
        // }

        // int count = 0;
        // for (int i = 10; i < 50; i++) {
        //     if (isPrime(i)) {
        //         count++;
        //         System.out.println("Number " + i + " is a prime number.");
        //         if (count == 3) {
        //             System.out.println("Exiting for loop.");
        //             break;
        //         }
        //     }
        // }
        
        // Sum3And5 myTry = new Sum3And5();
        // myTry.sum();
        // myTry.instructorSum();

        // SumOdd myTry = new SumOdd();
        // System.out.println(myTry.sumOdd(100, 1000));


        // WHILE LOOP PRACTICE
        // int count = 1;
        // while (count != 6) {
        //     System.out.println("Count value is " + count);
        //     count++;
        // }

        // while (true) { // Infinite loop
        //     if (count == 6) { // Condition that stops the infinite loop
        //         break;
        //     }

        //     System.out.println("Count value is " + count);
        //     count++;
        // }


        // DO WHILE LOOP PRACTICE
        // int count = 1;

        // do {
        //     System.out.println("Count is: " + count);
        //     count++;
        // } while (count < 6);

        // EvenNum myTry = new EvenNum();
        // System.out.println(myTry.isEvenNumber(21));

        // int number = 4;
        // int lastNumber = 20;
        // int totalEvenNums = 0;

        // while (number <= lastNumber) {
        //     number++;

        //     if (!myTry.isEvenNumber(number)) {
        //         continue;
        //     }

        //     System.out.println("Even number " + number);

        //     totalEvenNums++;
        //     if (totalEvenNums >= 5) {
        //         break;
        //     }
        // }

        // System.out.println("Total even numbers: " + totalEvenNums);

        // DigitSum myTry = new DigitSum();
        // System.out.println(myTry.instructorSumDigits(333));

        // NumPalindrome attempt = new NumPalindrome();
        // System.out.println(attempt.isPalindrome(11212));

        // int num = 121;
        // int copyOfnum = num;
        // int reversed = 0;

        // System.out.println("Original number: " + num);
        // while (num != 0) {
        //     int remainder = num % 10;
        //     reversed = reversed * 10 + remainder;
        //     num /= 10;
        // }

        // System.out.println("Reversed number: " + reversed);
        // boolean result = (copyOfnum == reversed);
        // System.out.println("Result: " + result);
    }




    // MORE FOR LOOP PRACTICE
    public static double calcInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
