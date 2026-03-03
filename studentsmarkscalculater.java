import java.util.Scanner;

// Program to calculate total and average marks
public class studentsmarkscalculater{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double subject1;
        double subject2;
        double subject3;
        double totalMarks;
        double averageMarks;

        System.out.print("Enter marks for Subject 1: ");
        subject1 = input.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        subject2 = input.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        subject3 = input.nextDouble();

        totalMarks = subject1 + subject2 + subject3;
        averageMarks = totalMarks / 3;

        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Marks = " + averageMarks);

        input.close();
    }
}