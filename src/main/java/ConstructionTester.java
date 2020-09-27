import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Construction myConstruction;
        double lumberCost;
        double windowCost;
        double lumberPrice;
        double windowPrice;
        double total;

        // Set prices & tax rates, create construction class
        lumberCost = 8.0;
        windowCost = 11.0;
        System.out.println("Enter the sales tax rate:");
        myConstruction = new Construction(lumberCost, windowCost, in.nextDouble());

        // Find lumber and window prices
        System.out.println("How many boards do you need?");
        lumberPrice = myConstruction.lumberCost(in.nextInt());
        System.out.println("How many windows do you need?");
        windowPrice = myConstruction.windowCost(in.nextInt());
        
        // Calculate totals 
        total = lumberPrice + windowPrice;
        System.out.println("Total: " + total);
        System.out.print("Grand Total: " + myConstruction.grandTotal(total));

    }
}
