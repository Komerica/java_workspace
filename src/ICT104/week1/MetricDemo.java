package ICT104.week1;
import javax.swing.JOptionPane;

/**
 This program demonstrates the Metric class.
 */

public class MetricDemo
{
    public static void main(String[] args)
    {
        String input; // To hold input
        double miles; // A distance in miles
        double kilos; // A distance in kilometers

        // Get a distance in miles.
        input = JOptionPane.showInputDialog("Enter " +
                "a distance in miles.");    // Show Input Dialog with the message assigned and assign that to a variable "input"
        System.out.println(input.getClass().getName()); // showInputDialog returns String value
        miles = Double.parseDouble(input);  // Convert the value that was entered above into double data type (String → double)

        // Convert the distance to kilometers.
        kilos = Metric.milesToKilometers(miles);    // Call mileToKilometers method from Metric class
        JOptionPane.showMessageDialog(null,
                String.format("%,.2f miles equals %,.2f kilometers.",
                        miles, kilos));     // Show a message dialog which prints the message that is entered as an argument
        // ✔ Formatting Syntax
        //  ","    : separate digit groups with comma
        //  "%f"   : floating point (decimal number)
        //  "%.2f" : return value with 2 decimal places

        // Get a distance in kilometers.
        input = JOptionPane.showInputDialog("Enter " +
                "a distance in kilometers: ");  // Show input Dialog with the message assigned and assign that to a variable "input"
        System.out.println(input.getClass().getName()); // showInputDialog returns String value
        kilos = Double.parseDouble(input);      // Convert the value that was entered above into double data type (String → double)

        // Convert the distance to kilometers.
        miles = Metric.kilometersToMiles(kilos);    // Call kilometersToMiles method created in Metric class
        JOptionPane.showMessageDialog(null,
                String.format("%,.2f kilometers equals %,.2f miles.",
                        kilos, miles));     // Show a message dialog that prints the message that is assigned as an argument

        System.exit(0); // 0 means Indicates successful termination
        // The exit() method of System class terminates the current JVM(Java Virtual Machine) running on system.
    }
}
