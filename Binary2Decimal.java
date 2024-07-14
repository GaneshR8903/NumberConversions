import java.util.Scanner;

public class Binary2Decimal {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Binary number :");
            String binary=sc.nextLine();
            int decimal=Integer.parseInt(binary,2);
            System.out.println("Decimal value of "+binary+" with builtin function is :"+decimal);
            int decimal1 = binaryToDecimal(binary);
            System.out.println("Decimal value of " + binary + " without inbuilt function is: " + decimal1);
        }
    }
    public static int binaryToDecimal(String binary){
        int decimal=0;
        int base=1;
    
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2; 
        }
        return decimal;
    }
}
