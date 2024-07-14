import java.util.Scanner;

public class Decimal2Hexadecimal {
   public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number :");
            int decimal=sc.nextInt();
            String hex=Integer.toHexString(decimal).toUpperCase();
            System.out.println("Hexadecimal value of "+decimal+" using bulitin function is :"+hex);
            String hex1 = decimalToBinary(decimal);
            System.out.println("Hexadecimal value of " + decimal + " without inbuilt function is: " + hex1);
        }
    }
    public static String decimalToBinary(int decimal){
        if(decimal==0){
            return "0";
    }
    StringBuilder hex =new StringBuilder();
    while(decimal>0){
        int remainder=decimal%16;
        char hexChar;
        if(remainder<10){
            hexChar=(char)('0'+remainder);
        }
        else{
            hexChar=(char)('A'+(remainder-10));
        }
        hex.insert(0, hexChar);
        decimal/=16;
    }
    return hex.toString();
    } 
}
