 class solution9 {
    public static void main(String[] args) {
        // create a Byte instance
        Byte byteObj = 127;

        // convert Byte to byte
        byte byteValue = byteObj.byteValue();
        System.out.println("Byte value as byte: " + byteValue);

        // convert Byte to short
        short shortValue = byteObj.shortValue();
        System.out.println("Byte value as short: " + shortValue);

        // convert Byte to int
        int intValue = byteObj.intValue();
        System.out.println("Byte value as int: " + intValue);

        // convert Byte to long
        long longValue = byteObj.longValue();
        System.out.println("Byte value as long: " + longValue);

        // convert Byte to float
        float floatValue = byteObj.floatValue();
        System.out.println("Byte value as float: " + floatValue);

        // convert Byte to double
        double doubleValue = byteObj.doubleValue();
        System.out.println("Byte value as double: " + doubleValue);
    }
}
