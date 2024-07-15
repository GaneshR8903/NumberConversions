import java.util.Scanner;

public class Binary2Hexadecimal {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Binary number :");
            String binary=sc.nextLine();
            int decimal=Integer.parseInt(binary,2);
            String hex=Integer.toHexString(decimal).toUpperCase();
            System.out.println("Hexadecimal value of "+binary+" with builtin function is :"+hex);
            String hex1 = binaryToHexa(binary);
            System.out.println("Hexadecimal value of " + binary + " without inbuilt function is: " + hex1);
        }
    }
    public static String binaryToHexa(String binary){
        int decimal=0;
        int base=1;
    
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2; 
        }
        StringBuilder hex=new StringBuilder();
        while(decimal>0){
            int remainder=decimal%16;
            char hexChar;
            if(remainder<10){
                hexChar=(char)('0'+remainder);
            }else{
                hexChar=(char)('A'+(remainder-10));
            }
            hex.insert(0,hexChar);
            decimal/=16;
        }
        return hex.toString();
}
}
