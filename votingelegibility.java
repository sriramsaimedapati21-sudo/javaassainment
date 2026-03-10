import java.util.Scanner;

public class votingelegibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable to store age
        int age;

        // Input
        System.out.print("Enter your age: ");
        age = input.nextInt();

        // Check eligibility
        boolean isEligible = age >= 18;

        if (isEligible) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        input.close();
    }
}