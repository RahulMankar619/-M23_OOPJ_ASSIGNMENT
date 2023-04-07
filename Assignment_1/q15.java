
class Solution15 {
    public static void main(String[] args) {
       
       // Initializing a int value
       int value = 1278;
       
       // Getting the number of bits used to represent a int value
       int bits = Integer.SIZE;
       
       // Getting the number of bytes used to represent a int value
       int bytes = Integer.BYTES;
       
       // Getting the minimum value a int can hold
       int minValue = Integer.MIN_VALUE;
       
       // Getting the maximum value a int can hold
       int maxValue = Integer.MAX_VALUE;
       
       // Printing the results
       System.out.println("Number of bits: " + bits);
       System.out.println("Number of bytes: " + bytes);
       System.out.println("Minimum value: " + minValue);
       System.out.println("Maximum value: " + maxValue);
    }
 }