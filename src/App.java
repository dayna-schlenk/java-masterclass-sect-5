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

        DayOfWeek myDay = new DayOfWeek();
        System.out.println(myDay.printDayofWk(3));
        System.out.println(myDay.ifElseDay(3));
    }
}
