class Solution13{
    public static void main(String[] args) {
        short sh = 1234;
        // short value into string

        String str = Short.toString(sh);
        System.out.println("short value into string "+str);

        


        // short value to short instance
        Short sht = Short.valueOf(sh);
        System.out.println("short value into short instance "+sht);

        // short instance to string instance
        String str1 = "5432";
        Short sh1 = Short.valueOf(str1);
        System.out.println("short instance into string instance "+str1);


    
    }
}
