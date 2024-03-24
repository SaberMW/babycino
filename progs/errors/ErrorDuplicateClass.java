public class ErrorDuplicateClass {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        boolean condition = true; // Replace 'x' with a boolean expression
        do {
            System.out.println("Inside loop");
            y--;
        } while (condition); // Use the boolean expression as the condition
        System.out.println("Outside loop");
    }
}

class Duplicated {
    public static void main(String[] args) {
        int x = 0; // Condition is false initially
        int y = 10;
        do {
            System.out.println("Inside loop");
            y--;
        } while (x < 0); // Condition should be checked at the start, so the loop should not execute
        System.out.println("Outside loop");
    }
}

class TestBugH3 {
    public static void main(String[] args) {
        int x = 5; // Condition becomes true after one iteration
        int y = 10;
        do {
            System.out.println("Inside loop");
            y--;
        } while (x == 5); // Condition becomes true after one iteration
        System.out.println("Outside loop");
    }
}