
class Solution20{
    public static void main(String[] args) {
        long num = 55666l;
        // long value into string

        String str = Long.toString(num);
        System.out.println("long value into string "+str);

        


        // long value to long instance
        Long num1 = Long.valueOf(num);
        System.out.println("long value into short instance "+num1);

        //  string instance to Long instance 
        String str1 = "5432";
        Long num2 = Long.valueOf(str1);
        System.out.println("string instance to Long instance "+num2);

        // long value into binary,octal,hex string

        String strb = Long.toBinaryString(num);
        String stro = Long.toOctalString(num);
        String strh = Long.toHexString(num);

        System.out.println("int value into binary string "+strb);
        System.out.println("int value into octal string "+stro);
        System.out.println("int value into hex string "+strh);


    
    }
}