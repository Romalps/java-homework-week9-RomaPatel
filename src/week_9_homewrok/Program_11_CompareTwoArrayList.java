package week_9_homewrok;

import java.util.ArrayList;

/*
11. Declare following two arrylist and compare it.
ArrayList<String> c1= new ArrayList<String>();
c1.add("Red");
c1.add("Green");
c1.add("Black");
c1.add("White");
c1.add("Pink");
ArrayList<String> c2= new ArrayList<String>();
c2.add("Red");
c2.add("Green");
c2.add("Black");
c2.add("Pink");
 */
public class Program_11_CompareTwoArrayList {

    public static void main(String[] args) {
        // create object to call instance method
        Program_11_CompareTwoArrayList compare = new Program_11_CompareTwoArrayList();
        compare.compareTwoArrayList();
    }

    public void compareTwoArrayList() {
        // create first Arraylist object
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");// add elements to arraylist
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("First ArrayList: " + c1);
        // Create second Arraylist object
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("Second ArrayList : " + c2);
        // Comparing both Arraylist
        boolean compare = c1.equals(c2);//return false
        System.out.println("Is c1 nad c2 ArrayList is same ? " + compare);
    }
}
