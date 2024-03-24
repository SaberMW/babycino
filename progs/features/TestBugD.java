// A program that should result in a compiling error for incorrect type usage with the ">=" operator

class TestBugD {
    public static void main(String[] a) {
        System.out.println(new Test().f());
    }
}

class Test {

    public int f() {
        int result;
        int count;
        result = 0;
        count = 1;
        while (true >= count) { // Should output type error that an int was expected
            result = result + count;
            count = count + 1;
        }
        return result;
    }

}
