class solution6{
    public static void main(String[] args) {
        boolean b = true;
        String str1 = Boolean.toString(b);

        boolean c = new Boolean("false");

       

        String str2 = "True";
        boolean d = Boolean.parseBoolean(str2);

        String str3 = "False";

        boolean bool = new Boolean (Boolean.valueOf(str3));
        boolean bool1 = new Boolean ((str3));
        


        System.out.println(str1);
        System.out.println(c);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(bool1);
    }
}