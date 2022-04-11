public class DayOfWeek {
    public String printDayofWk(int day) {
        String result = "";
        switch (day) {
            case 1:
                result = "Sunday";
                break;
            case 2:
                result = "Monday";
                break;
            case 3:
                result = "Tuesday";
                break;
            case 4:
                result = "Wednesday";
                break;
            case 5:
                result = "Thursday";
                break;
            case 6:
                result = "Friday";
                break;
            case 7:
                result = "Saturday";
                break;
            default:
                result = "Invalid day";
                break;
        }

        return result;
    }

    // If statement-version of the method above
    public String ifElseDay(int day) {
        String ifResult = "";

        if (day == 1) {
            ifResult = "Sunday";
        } else if (day == 2) {
            ifResult = "Monday";
        } else if (day == 3) {
            ifResult = "Tuesday";
        } else if (day == 4) {
            ifResult = "Wednesday";
        } else if (day == 5) {
            ifResult = "Thursday";
        } else if (day == 6) {
            ifResult = "Friday";
        } else if (day == 7) {
            ifResult = "Saturday";
        } else {
            ifResult = "Invalid day";
        }

        return ifResult;
    }
}
