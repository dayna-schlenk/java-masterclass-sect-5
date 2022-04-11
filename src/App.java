public class App {
    public static void main(String[] args) throws Exception {
        // Switch statement practice
        int switchValue = 13;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:case 4:case 5: // shortcut
                System.out.println("Value is either 3, 4, or 5");
                break;
            default: // aka, "else"
                System.out.println("Value is not 1 through 5");
                break;
        }
    }
}
