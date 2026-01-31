//Jonathan Sonnek
//January 30, 2026
//Name APP

import java.util.Scanner;
import java.text.NumberFormat;
public class Main {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {

//      Ask first name
        System.out.print("Please enter your first name: ");
        String firstName = userinput.nextLine();

//      Ask last name
        System.out.print("Please enter your last name: ");
        String lastName = userinput.nextLine();

//      Ask age
        System.out.print("Please enter your age: ");
        int age = userinput.nextInt();

//      Ask sleep in hours
        System.out.print("Please enter your average amount of sleep (in hours per day): ");
        double sleepHours = userinput.nextDouble();

//      Display the information
        System.out.format("Full Name: %s %s%n", firstName, lastName);
        System.out.format("Age: %d%n", age);
        System.out.format("Average Sleep (hours per day): %.1f%n", sleepHours);
        userinput.close();
    }
}
