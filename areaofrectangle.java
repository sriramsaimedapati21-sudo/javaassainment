import java.util.Scanner;

// Program to calculate area of rectangle
public class areaofrectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user inputs
        double length;
        double width;
        double area;

        System.out.print("Enter length: ");
        length = input.nextDouble();

        System.out.print("Enter width: ");
        width = input.nextDouble();

        // Calculating area
        area = length * width;

        System.out.println("Area of Rectangle = " + area);

        input.close();
    }
}