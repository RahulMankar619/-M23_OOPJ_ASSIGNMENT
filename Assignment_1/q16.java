
class Solution16{
    public static void main(String[] args) {
        int num = 55666;
        // int value into string

        String str = Integer.toString(num);
        System.out.println("int value into string "+str);

        


        // int value to integer instance
        Integer num1 = Integer.valueOf(num);
        System.out.println("int value into short instance "+num1);

        // integer instance to string instance
        String str1 = "5432";
        Integer num2 = Integer.valueOf(str1);
        System.out.println("int instance into string instance "+str1);

        // int value into binary,octal,hex string

        String strb = Integer.toBinaryString(num);
        String stro = Integer.toOctalString(num);
        String strh = Integer.toHexString(num);

        System.out.println("int value into binary string "+strb);
        System.out.println("int value into octal string "+stro);
        System.out.println("int value into hex string "+strh);


    
    }
}