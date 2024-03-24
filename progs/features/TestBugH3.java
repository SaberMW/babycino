class TestBugH3 {
    public static void main(String[] args) {
        boolean condition = true;
        int i = 0;
        do {
            System.out.println("Loop iteration");
            i++;
        } while (condition); // Bug: Loop does not terminate when condition is true
        System.out.println("Loop terminated after " + i + " iterations");
    }
}