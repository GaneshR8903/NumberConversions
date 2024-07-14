import java.util.Scanner;

public class Decimal2Octal{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number :");
            int decimal=sc.nextInt();
            String octal=Integer.toOctalString(decimal);
            System.out.println("Binary value of "+decimal+" is :"+octal);
            String octal1 = decimalToBinary(decimal);
            System.out.println("Binary value of " + decimal + " without inbuilt function is: " + octal1);
        }
    }
    public static String decimalToBinary(int decimal){
        if(decimal==0){
            return "0";
    }
    StringBuilder octal =new StringBuilder();
    while(decimal>0){
        int remainder=decimal%8;
        octal.insert(0, remainder);
        decimal/=8;
    }
    return octal.toString();
    }
}