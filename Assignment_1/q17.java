class Solution17 {
    public static void main(String[] args) {
        // create a Int instance
        Integer intObj = 12745;

        // convert Int to byte
        byte byteValue = intObj.byteValue();
        System.out.println("Int value as byte: " + byteValue);

        // convert Int to short
        short shortValue = intObj.shortValue();
        System.out.println("Int value as short: " + shortValue);

        // convert Int to int
        int intValue = intObj.intValue();
        System.out.println("Int value as int: " + intValue);

        // convert Int to long
        long longValue = intObj.longValue();
        System.out.println("Int value as long: " + longValue);

        // convert Int to float
        float floatValue = intObj.floatValue();
        System.out.println("Int value as float: " + floatValue);

        // convert Int to double
        double doubleValue = intObj.doubleValue();
        System.out.println("Int value as double: " + doubleValue);
    }
}