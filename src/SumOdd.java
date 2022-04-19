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

    // public int sumOdd(int start, int end) {
    //     for (int i = start; i <= end; i++) {
    //         // do something
    //     }
    // }
}
