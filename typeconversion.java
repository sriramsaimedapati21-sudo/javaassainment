import java.util.Scanner;

// Program to demonstrate type casting
public class typeconversion{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double decimalNumber;
        int convertedNumber;

        System.out.print("Enter a decimal number: ");
        decimalNumber = input.nextDouble();

        convertedNumber = (int) decimalNumber;

        System.out.println("After Type Conversion: " + convertedNumber);

        input.close();
    }
}