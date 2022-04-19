public class SumOdd {
    public boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    public int sumOdd(int start, int end) {
        int sum = 0;
        
        if (start < 0 || end < 0 || end < start) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }

        return sum;
    }
}
