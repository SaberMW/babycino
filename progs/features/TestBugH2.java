class TestBugH2 {
    public static void main(String[] args) {
        boolean condition = false;
        do {
            System.out.println("Loop iteration");
        } while (condition); // Bug: Incorrectly checks condition at start of loop
    }
}
