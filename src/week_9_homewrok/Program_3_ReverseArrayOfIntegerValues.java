package week_9_homewrok;

import java.util.ArrayList;
import java.util.Scanner;

/*Write a Java program to reverse an array of integer values.
 */
public class Program_3_ReverseArrayOfIntegerValues {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        //declare Arraylist
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Enter the number of elements in the array: ");
        int num = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < num; i++) {
            int n = scanner.nextInt();
            numbers.add(n);
        }
        scanner.close();// closing scanner object
        System.out.println("Original array : " + numbers);

        ArrayList<Integer> reverseNumbers = new ArrayList<Integer>();

        for (int i = num - 1; i >= 0; i--) {
            reverseNumbers.add(numbers.get(i));
        }
        System.out.println("Reversed array : " + reverseNumbers);
    }
}
