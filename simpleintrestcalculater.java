import java.util.Scanner;

// Program to calculate simple interest
public class simpleintrestcalculater{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principalAmount;
        double rateOfInterest;
        double timePeriod;
        double simpleInterest;

        System.out.print("Enter Principal Amount: ");
        principalAmount = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rateOfInterest = input.nextDouble();

        System.out.print("Enter Time Period: ");
        timePeriod = input.nextDouble();

        simpleInterest = (principalAmount * rateOfInterest * timePeriod) / 100;

        System.out.println("Simple Interest = " + simpleInterest);

        input.close();
    }
}