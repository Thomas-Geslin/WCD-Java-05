class Numeric {
    public static boolean valueIsOdd(int testingInteger) {
        return testingInteger % 2 == 1;
    }

    public static boolean valueIsEven(int testingInteger) {
        return testingInteger % 2 == 0;
    }

    public static int computeSquare(int testingInteger) {
        return testingInteger * testingInteger;
    }

    public static int computeCube(int testingInteger) {
        return testingInteger * testingInteger * testingInteger;
    }

    public static void main(String[] args) {
        System.out.println(valueIsOdd(2));
        System.out.println(valueIsOdd(5));

        System.out.println(valueIsEven(2));
        System.out.println(valueIsEven(5));

        System.out.println(computeSquare(2));
        System.out.println(computeSquare(5));

        System.out.println(computeCube(2));
        System.out.println(computeCube(5));
    }
}