
class Solution12 {
    public static void main(String[] args) {
       
       // Initializing a byte value
       short value = 1278;
       
       // Getting the number of bits used to represent a short value
       int bits = Short.SIZE;
       
       // Getting the number of bytes used to represent a short value
       int bytes = Short.BYTES;
       
       // Getting the minimum value a short can hold
       short minValue = Short.MIN_VALUE;
       
       // Getting the maximum value a short can hold
       short maxValue = Short.MAX_VALUE;
       
       // Printing the results
       System.out.println("Number of bits: " + bits);
       System.out.println("Number of bytes: " + bytes);
       System.out.println("Minimum value: " + minValue);
       System.out.println("Maximum value: " + maxValue);
    }
 }