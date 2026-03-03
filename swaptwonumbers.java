import java.util.Scanner;

// Program to swap two numbers
public class swaptwonumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int temp;

        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();

        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After Swapping:");
        System.out.println("First Number = " + firstNumber);
        System.out.println("Second Number = " + secondNumber);

        input.close();
    }
}