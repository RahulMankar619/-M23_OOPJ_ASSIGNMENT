 class Solution10 {
    public static void main(String[] args) {
       
       // Initializing a char value
       char value = 'A';
       
       // Getting the number of bits used to represent a char value
       int bits = Character.SIZE;
       
       // Getting the number of bytes used to represent a char value
       int bytes = Character.BYTES;
       
       // Getting the minimum value a char can hold
       char minValue = Character.MIN_VALUE;
       
       // Getting the maximum value a char can hold
       char maxValue = Character.MAX_VALUE;
       
       // Printing the results
       System.out.println("Number of bits: " + bits);
       System.out.println("Number of bytes: " + bytes);
       System.out.println("Minimum value: " + (int) minValue);
       System.out.println("Maximum value: " + (int) maxValue);
    }
 }
 