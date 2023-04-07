class Solution11 {
    public static void main(String[] args) {
       
       // Check if a character was entered on the command line
       if (args.length == 0) {
          System.out.println("Please enter a character on the command line");
         
          return;
       }
       
       // Extract the character from the command line argument
       char ch = args[0].charAt(0);
      
       
       // Check if the character is a letter or a digit
       if (Character.isDigit(ch)) {
          System.out.println("The character is a digit: " + ch);
          System.out.println("Its value is: " + Character.getNumericValue(ch));
          System.out.println("Its code point is: " + (int) ch);
       }
       else if (Character.isLetter(ch)) {
          if (Character.isLowerCase(ch)) {
             char upper = Character.toUpperCase(ch);
             System.out.println("The character is in lower case: " + ch);
             System.out.println("Its upper case equivalent is: " + upper);
             System.out.println("Its code point is: " + (int) ch);
          }
          else if (Character.isUpperCase(ch)) {
             char lower = Character.toLowerCase(ch);
             System.out.println("The character is in upper case: " + ch);
             System.out.println("Its lower case equivalent is: " + lower);
             System.out.println("Its code point is: " + (int) ch);
          }
       }
       else {
          System.out.println("The entered character is neither a letter nor a digit.");
       }
    }
 }
 
