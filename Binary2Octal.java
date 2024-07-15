import java.util.Scanner;

public class Binary2Octal {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Binary number :");
            String binary=sc.nextLine();
            int decimal=Integer.parseInt(binary,2);
            String octal=Integer.toOctalString(decimal);
            System.out.println("Octal value of "+binary+" with builtin function is :"+octal);
            String octal1 = binaryToOctal(binary);
            System.out.println("Octal value of " + binary + " without inbuilt function is: " + octal1);
        }
    }
    public static String binaryToOctal(String binary){
        int decimal=0;
        int base=1;
    
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2; 
        }
        StringBuilder octal=new StringBuilder();
        while(decimal>0){
            int remainder=decimal%8;
            octal.insert(0,remainder);
            decimal/=8;
        }
        return octal.toString();
    } 
}
