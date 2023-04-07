class Solution25 {
    public static void main(String[] args) {
        // create a Float instance
        Float floatObj = 12745f;

        // convert Float to byte
        byte byteValue = floatObj.byteValue();
        System.out.println("Float value as byte: " + byteValue);

        // convert Float to short
        short shortValue = floatObj.shortValue();
        System.out.println("Float value as short: " + shortValue);

        // convert Float to int
        int intValue = floatObj.intValue();
        System.out.println("Float value as int: " + intValue);

        // convert Float to long
        long longValue = floatObj.longValue();
        System.out.println("Float value as long: " + longValue);

        // convert Float to float
        float floatValue = floatObj.floatValue();
        System.out.println("Float value as float: " + floatValue);

        // convert Float to double
        double doubleValue = floatObj.doubleValue();
        System.out.println("Float value as double: " + doubleValue);
    }
}