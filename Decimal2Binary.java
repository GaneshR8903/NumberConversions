import java.util.Scanner;

public class Decimal2Binary{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number :");
            int decimal=sc.nextInt();
            String binary=Integer.toBinaryString(decimal);
            System.out.println("Binary value of "+decimal+" is :"+binary);
            String binary1 = decimalToBinary(decimal);
            System.out.println("Binary value of " + decimal + " without inbuilt function is: " + binary1);
        }
    }
    public static String decimalToBinary(int decimal){
        if(decimal==0){
            return "0";
    }
    StringBuilder binary =new StringBuilder();
    while(decimal>0){
        int remainder=decimal%2;
        binary.insert(0, remainder);
        decimal/=2;
    }
    return binary.toString();
    }
}