import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double startLat;
        double startLong;
        double endLat;
        double endLong;
        GeoLocation start;
        GeoLocation end;

        // Creating starting location
        System.out.print("Enter the latitude of the starting location: ");
        startLat = in.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        startLong = in.nextDouble();
        start = new GeoLocation(startLat,startLong);

        // Creating ending location
        System.out.print("Enter the latitude of the ending location: ");
        endLat = in.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        endLong = in.nextDouble();
        end = new GeoLocation(endLat,endLong);

        // Printing distance between start and end
        System.out.print("The distance is "+start.distanceFrom(end)+" miles.");
    }
}