import java.util.Scanner;

class solution33{
    public static void main(String[] args) {
        
        String str1 = args[0];
        int a = Integer.parseInt(str1);
        

        String str2 = args[1];
        double b = Double.parseDouble(str2);

        

        String str3 = args[2];
        float f = Float.parseFloat(str3);

        System.out.println("Enter the operation u want to perform on above values");

        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        sc.close();

  

        switch (i) {
            case 1:
            System.out.println(a+b+f);
                
                break;

            case 2:
            System.out.println(a-b-f);
                
                break;
            
            case 3:
            System.out.println(a*b*f);
                    
                break;

            case 4:
            System.out.println(a/b/f);
                        
                break;    
        
            default:
                break;
        }


    }
}
