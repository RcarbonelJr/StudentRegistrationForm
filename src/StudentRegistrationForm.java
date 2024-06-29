/* Author: Randall Carbonel
 * Date: 6/29/24
 * Class: ASD216 - Java Programming
 * Assignment: Create an application that allows a student to enter registration information.
 *             The application should display a completion message that includes the user’s
 *             full name and a temporary password.
 * Specifications:
 * - The user’s full name consists of the user’s first name, a space, and the user’s last name.
 * - The temporary password consists of the user’s first name, an asterisk (*), and the user’s birth year.
 * - Assume that the user will enter a valid 4-digit integer for the year.
 */

import java.util.Scanner;

public class StudentRegistrationForm {
    public static void main(String[] args) {
        // variables
        String firstName;
        String lastName;
        int birthYear;

        Scanner sc = new Scanner(System.in);

        // print name of program
        System.out.println("Student Registration Form");

        // get user inputs
        System.out.print("First Name: ");
        firstName = sc.nextLine();

        System.out.print("Last Name: ");
        lastName = sc.nextLine();

        System.out.print("Year of Birth: ");
        birthYear = sc.nextInt();

        // output
            // full name
        System.out.println("Welcome " + firstName + " " + lastName + "!");
        System.out.println("You registration is complete.");
            // temp password
        System.out.print("Your temporary password is: " + firstName + "*" + birthYear);
    }
}
