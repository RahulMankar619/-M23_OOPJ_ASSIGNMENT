class solution8{
    public static void main(String[] args) {
        byte b = 123;
        byte c = 124;
        String str1 = Byte.toString(b);
        Byte obj1 = Byte.valueOf(c);

        String str2 = "12";
         Byte obj2 = Byte.valueOf(str2);

        

        System.out.println(str1);
        System.out.println(obj1);
        System.out.println(str2);
        System.out.println(obj2);


    }
}