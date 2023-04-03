package week_9_homewrok;

import java.util.ArrayList;

/*
6. Write a Java program to retrieve an element (at a specified index) from a given
array list
 */
public class Program_6_RetrieveElementFromArrayList {

    ArrayList list = new ArrayList<>();// Creating  arraylist

    public static void main(String[] args) {
        Program_6_RetrieveElementFromArrayList retrieve= new Program_6_RetrieveElementFromArrayList();
        retrieve.addElement();

    }

    public void addElement() {// Instance method
        // Using add() to initialise the values
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Ruby");
        list.add("Java Script");
        list.add("C#");

        // Retrieving individual value from the arraylist using print statement
        System.out.println("First element is : " + list.get(0));
        System.out.println("Second element is : " + list.get(1));
        System.out.println("Third element is : " + list.get(2));
        System.out.println("Forth element is : " + list.get(3));
        System.out.println("Fifth element is : " + list.get(4));
        System.out.println("Sixth element is : " + list.get(5));

        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {// Retrieving value from the arraylist using for loop
            System.out.println(i + " element is: " + list.get(i));
        }
    }

}
