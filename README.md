# Project_4
 Merrimack CSC 6301 week 4 project
 
## File: SortedLinkedList

The project for week 4 scans a list of integers from the user input, sorts them, and then prints out the final list. This code shows that the Java's built-in classes and methods can be used to make a Linked List code without having to type the code from scratch.

## Coding features

- Prompts the user to enter a list of integers (press enter after each number to add the integer, then continue to add other integers).
- Reads and handles user input, including errors.
- Sorts the users input in order from smallest to largest.
- Stores the sorted integers in a Linked List.
- Displays the sorted list of integers to the user.

## Running the Code on the Command Line

Use the following commands in your terminal to generate documentation and run the program in windows:

Command to generate documentation:
javadoc SortedLinkedList.java

Command to run program:
java SortedLinkedList.java

## How the Code Works

1. The program displays a message telling the user to enter a list of integers (after inputing a desired integer, press enter and continue adding integers) and instructs the user to type "done" to end the input.
2. It scans the integers entered by the user, the code allows for handling potential errors (like anything that is not an integer). It will continue to scan inputs until the user types "done".
3. It sorts the collected integers in order from smallest to largest using Collections.sort(numbers).
4. The sorted integers are saved in a LinkedList in the sorted order.
5. Then the sorted integers are displayed to the user.

