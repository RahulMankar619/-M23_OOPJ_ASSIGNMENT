class Solution29 {
    public static void main(String[] args) {
        // create a Double instance
        Double doubleObj = 1274545d;

        // convert Double to byte
        byte byteValue = doubleObj.byteValue();
        System.out.println("Double value as byte: " + byteValue);

        // convert Double to short
        short shortValue = doubleObj.shortValue();
        System.out.println("Double value as short: " + shortValue);

        // convert Double to int
        int intValue = doubleObj.intValue();
        System.out.println("Double value as int: " + intValue);

        // convert Double to long
        long longValue = doubleObj.longValue();
        System.out.println("Double value as long: " + longValue);

        // convert Double to float
        float floatValue = doubleObj.floatValue();
        System.out.println("Double value as float: " + floatValue);

        // convert Double to double
        double doubleValue = doubleObj.doubleValue();
        System.out.println("Double value as double: " + doubleValue);
    }
}