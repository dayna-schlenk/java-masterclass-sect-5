public class SumOdd {
    public boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
