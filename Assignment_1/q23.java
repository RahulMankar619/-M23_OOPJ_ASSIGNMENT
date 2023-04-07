
class Solution23 {
    public static void main(String[] args) {
       
       // Initializing a float value
       float value = 1278l;
       
       // Getting the number of bits used to represent a float value
       float bits = Long.SIZE;
       
       // Getting the number of bytes used to represent a float value
       float bytes = Long.BYTES;
       
       // Getting the minimum value a float can hold
       float minValue = Long.MIN_VALUE;
       
       // Getting the maximum value a float can hold
       float maxValue = Long.MAX_VALUE;
       
       // Printing the results
       System.out.println("Number of bits: " + bits);
       System.out.println("Number of bytes: " + bytes);
       System.out.println("Minimum value: " + minValue);
       System.out.println("Maximum value: " + maxValue);
    }
 }