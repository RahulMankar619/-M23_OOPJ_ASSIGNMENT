 class Solution14 {
    public static void main(String[] args) {
        // create a Short instance
        Short shortObj = 12745;

        // convert Short to byte
        byte byteValue = shortObj.byteValue();
        System.out.println("Short value as byte: " + byteValue);

        // convert Short to short
        short shortValue = shortObj.shortValue();
        System.out.println("Short value as short: " + shortValue);

        // convert Short to int
        int intValue = shortObj.intValue();
        System.out.println("Byte value as int: " + intValue);

        // convert Short to long
        long longValue = shortObj.longValue();
        System.out.println("Short value as long: " + longValue);

        // convert Short to float
        float floatValue = shortObj.floatValue();
        System.out.println("Short value as float: " + floatValue);

        // convert Short to double
        double doubleValue = shortObj.doubleValue();
        System.out.println("Short value as double: " + doubleValue);
    }
}
