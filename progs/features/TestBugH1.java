class TestBugH1 {
    public static void main(String[] args) {
        int x;
        int y;
        x = 5;
        y = 10;
        do {} while (x); // Bug: Using integer as condition
    }
}
