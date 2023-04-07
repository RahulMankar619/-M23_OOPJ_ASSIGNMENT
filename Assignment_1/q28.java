class solution28{
    public static void main(String[] args) {
        double d = 12345d;
        
        // double value to string
        String str = Double.toString(d);
        // double value to double instance

        double db = Double.valueOf(d);

        // string instance to double instance
        
        String str1 = "7654";

        double db1 = Double.parseDouble(str1);

        // double value to hex string
        String str2 = Double.toHexString(db1);

        System.out.println(str);
        System.out.println(db);
        System.out.println(db1);
        System.out.println(str2);
        
         
       
        


    }
}
