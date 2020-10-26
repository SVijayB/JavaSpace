package Data_Conversion;

// Program to convert decimal number to Hex string
import java.util.Scanner;

class DeciToHexa {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int decimal = input.nextInt();
        input.close();
        String hexa = Integer.toHexString(decimal);
        System.out.println("Converted Hex value : " + hexa);
    }
}