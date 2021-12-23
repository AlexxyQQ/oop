//Write a Java program for sorting a given list of names in ascending order?
package Assignment_1;

import java.util.*;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating an empty list named list
        List<String> list_of_names = new ArrayList<String>();
        // asking user how many name they want to add
        System.out.print("How many name you want to enter? : ");
        int choice = sc.nextInt();
        // loop to ask and add names to the list
        do {
            System.out.print("Enter a name: ");
            String name = sc.next();
            list_of_names.add(name);
            choice--;

        } while (choice > 0);
        // shorting the list in ascending order
        Collections.sort(list_of_names);

        // shorting the list in descending order
        // Collections.sort(list_of_names, Collections.reverseOrder());

        System.out.println(list_of_names);
    }
}
