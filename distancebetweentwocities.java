import java.util.Scanner;

// Program to calculate total travel distance
public class distancebetweentwocities {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distanceFromToVia;
        double distanceViaToFinalCity;
        double totalDistance;

        System.out.print("Enter distance from first city to via city: ");
        distanceFromToVia = input.nextDouble();

        System.out.print("Enter distance from via city to final city: ");
        distanceViaToFinalCity = input.nextDouble();

        totalDistance = distanceFromToVia + distanceViaToFinalCity;

        System.out.println("Total Distance = " + totalDistance);

        input.close();
    }
}