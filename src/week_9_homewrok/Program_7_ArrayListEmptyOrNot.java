package week_9_homewrok;

import java.util.ArrayList;

/*
7. Write a Java program to test if an array list is empty or not.
 */
public class Program_7_ArrayListEmptyOrNot {

    public void arrayList(){
        ArrayList list= new ArrayList<>();//Create Arraylist
        System.out.println("Newly crated ArrayList : "+ list);
        // check if ArrayList have any element or not
        boolean answer = list.isEmpty();//true
        System.out.println("is the Arraylist empty? " + answer);
        // added  some elements to the ArrayList
        list.add("Maths");
        list.add("English");
        list.add("Science");
        list.add("History");
        list.add("PE");
        list.add("PSHCE");
        list.add("Geography");
        list.add("Art");

        System.out.println("Updated ArrayList: "+ list);
        // check if ArrayList is empty or not
        answer= list.isEmpty();//false
        System.out.println("is the ArrayList empty? "+ answer);

    }

    public static void main(String[] args) {
        Program_7_ArrayListEmptyOrNot emptyOrNot=new Program_7_ArrayListEmptyOrNot();
        emptyOrNot.arrayList();
    }
}
