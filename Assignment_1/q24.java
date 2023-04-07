
class Solution24{
    public static void main(String[] args) {
        float num = 55666f;
        // float value into string

        String str = Float.toString(num);
        System.out.println("long value into string "+str);

        


        // float value to float instance
        Float num1 = Float.valueOf(num);
        System.out.println("float value into short instance "+num1);

        // String instance to float instance
        long num2 = 5432;
        String str1 = Long.toString(num2);
        System.out.println("string instance to float instance "+str1);

        // float value into binary,octal,hex string

        
        String strh = Float.toHexString(num);

        System.out.println("int value into hex string "+strh);


    
    }
}