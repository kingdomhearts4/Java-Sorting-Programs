import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

/**
 * This program reads an unlimited list of integer numbers from user input,
 * stores them in a LinkedList, and sorts them in ascending order.
 * The user can type "exit" to stop entering numbers.
 *
 */
public class SortedLinkedList {

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter integer numbers. Type 'exit' to finish input:");

        // Continuously read user input
        while (true) {
            String input = scanner.next();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                // Try to parse the input as an integer and add it to the list
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'exit' to finish.");
            }
        }

        // Sort the LinkedList
        Collections.sort(numbers);

        // Display the sorted list
        System.out.println("Sorted List: " + numbers);

        // Close the scanner
        scanner.close();
    }
}
