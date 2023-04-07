
class Solution27 {
    public static void main(String[] args) {
       
       // Initializing a double value
       double value = 1278l;
       
       // Getting the number of bits used to represent a double value
       double bits = Double.SIZE;
       
       // Getting the number of bytes used to represent a double value
       double bytes = Double.BYTES;
       
       // Getting the minimum value a double can hold
       double minValue = Double.MIN_VALUE;
       
       // Getting the maximum value a double can hold
       double maxValue = Double.MAX_VALUE;
       
       // Printing the results
       System.out.println("Number of bits: " + bits);
       System.out.println("Number of bytes: " + bytes);
       System.out.println("Minimum value: " + minValue);
       System.out.println("Maximum value: " + maxValue);
    }
 }