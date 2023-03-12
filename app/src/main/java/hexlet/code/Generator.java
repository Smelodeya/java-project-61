package hexlet.code;

public class Generator {
    private static final int INITIAL_VALUE = 1;
    private static final int FINAL_VALUE_100 = 100;
    private static final int FINAL_VALUE_10 = 10;

    public static int generateNumberFrom1To100() {
        return (INITIAL_VALUE + (int) (Math.random() * FINAL_VALUE_100));
    }

    public static int generateNumberFrom0To100() {
        return ((int) (Math.random() * FINAL_VALUE_100));
    }

    public static int generateNumberFrom1To10() {
        return (INITIAL_VALUE + (int) (Math.random() * FINAL_VALUE_10));
    }
}
