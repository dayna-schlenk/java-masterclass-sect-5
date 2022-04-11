public class App {
    public static void main(String[] args) throws Exception {
        // Switch statement practice
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default: // aka, "else"
                System.out.println("Value is neither 1 nor 2");
                break;
        }
    }
}
