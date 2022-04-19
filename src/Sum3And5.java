public class Sum3And5 {
    // MY SOLUTION
    public void sum() {
        int solution = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number is " + i);
                solution += i;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }

        System.out.println("Solution is " + solution);
    }

    // INSTRUCTOR'S SOLUTION
    public void instructorSum() {
        int instrCount = 0;
        int instrSum = 0;

        for(int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                instrCount++;
                instrSum += i;
                System.out.println("Found number = " + i);
            }

            if (instrCount == 5) {
                break;
            }
        }

        System.out.println("Sum = " + instrSum);
    }
}
