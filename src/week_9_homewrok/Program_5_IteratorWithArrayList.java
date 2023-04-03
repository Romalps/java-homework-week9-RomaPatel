package week_9_homewrok;

import java.util.ArrayList;
import java.util.Iterator;

/*
Write a Java program to iterate through all elements in an array list using
Iterator.
 */
public class Program_5_IteratorWithArrayList {
    ArrayList list = new ArrayList<>();// creating arraylist

    public static void main(String[] args) {
        Program_5_IteratorWithArrayList obj = new Program_5_IteratorWithArrayList();
        obj.addNumbers();
    }

    public void addNumbers() {// Instance method
        list.add("First");
        list.add("Second");
        list.add(3);
        list.add(4);
        list.add("Fifth");
        //Iterating ArrayList using Iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
    }
}
