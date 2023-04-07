class Solution21 {
    public static void main(String[] args) {
        // create a Long instance
        Long longObj = 12745l;

        // convert Long to byte
        byte byteValue = longObj.byteValue();
        System.out.println("Long value as byte: " + byteValue);

        // convert Long to short
        short shortValue = longObj.shortValue();
        System.out.println("Int value as short: " + shortValue);

        // convert Long to int
        int intValue = longObj.intValue();
        System.out.println("Long value as int: " + intValue);

        // convert Long to long
        long longValue = longObj.longValue();
        System.out.println("Long value as long: " + longValue);

        // convert Long to float
        float floatValue = longObj.floatValue();
        System.out.println("Long value as float: " + floatValue);

        // convert Long to double
        double doubleValue = longObj.doubleValue();
        System.out.println("Long value as double: " + doubleValue);
    }
}