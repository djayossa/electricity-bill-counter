import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter  units of electricity consumed (integer): " );
    int unitsConsumed = input.nextInt();
    if (unitsConsumed<1) {
    System.out.println("Invalid number of units");
    }else if (unitsConsumed<=100) {
    if (unitsConsumed<50) {
    double electricityBill = ((unitsConsumed*(1.50)) + 50)*(0.9);
    System.out.print("Total electricity bill (after discount): " + electricityBill);
    }else {
    double electricityBill = (unitsConsumed*(2.00)) + 50;
    System.out.print("Total electricity bill (after discount): " + electricityBill);
    }
    }else if (unitsConsumed>100 && unitsConsumed<=200) {
    double electricityBill = (unitsConsumed*(2.00)) + 50;
    System.out.print("Total electricity bill (after discount): " + electricityBill);
    }else if (unitsConsumed>200) {
    double electricityBill = (unitsConsumed*(1.50)) + 50;
    System.out.print("Total electricity bill (after discount): " + electricityBill);
    }
    }
}