import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class SortedLinkedList {
    
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Create a LinkedList to store Integer numbers
        LinkedList<Integer> numbers = new LinkedList<>();
        
        System.out.println("Enter integers (type 'done' to finish):");
        
        // Read input until the user types "done"
        while (true) {
            String input = scanner.nextLine();
            
            // Check if the user wants to stop input
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            
            try {
                // Parse the input as an Integer and add to the LinkedList
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println("Please enter a valid integer or type 'done' to finish.");
            }
        }
        
        // Sort the LinkedList
        Collections.sort(numbers);
        
        // Display the sorted list
        System.out.println("Sorted numbers: " + numbers);
        
        // Close the scanner
        scanner.close();
    }
}
