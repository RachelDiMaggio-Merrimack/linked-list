/**
* A LinkedList program in Java.
* 
* <p>@author Rachel DiMaggio</p>
* <p>CSC6031</p>

* <p>This program includes an example of code reuse, as I have used the pre-built Java utils 
* packages of LinkedList, Collection, and Scanner. I have also referenced several examples from GeeksforGeeks 
* and the AI suggestion of how to take LinkedList input that appears after a Google search.
* </p>
*/

/** A Java program that takes user input integers and creates an ordered LinkedList.
*/

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;

/** 
 * The LinkedListExample class allows user input of integers to create a linked list.
*/
public class LinkedListExample {
    /**
     * Default constructor for {@code LinkedListExample}.
     */
     public LinkedListExample() {
        // No initialization needed.
     }

    /**
     * The entry point of the program. The {@code main} method takes as many integers as the user enters.
     * The scanner remains open until the user enters a non-integer.
     * The resulting Linked List is then sorted by the 
     * Collections sort() method, and printed.
     * @param args Integers input by the user.
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Input integers to create a linked list." +
                           "End the list by typing any non-integer character."); 
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int number = sc.nextInt();
            list.add(number);
        }
        Collections.sort(list);
        System.out.println("Your linked list in order: " + list);
        sc.close();
    }

}
