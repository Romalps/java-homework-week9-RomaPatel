package week_9_homewrok;

import java.util.ArrayList;

/*4. Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.
*/
public class Program_4_AddColoursWithArrayList {

    ArrayList<String> list = new ArrayList<>();// created list object

    public void addColours() {// Instance method
        // add colours in list
        list.add("Green");
        list.add("Purple");
        list.add("Pink");
        list.add("Red");
        list.add("Yellow");
        list.add("Blue");

    }

    public boolean isColourPresentInTheList(String colourName) {// instance method
        return list.contains(colourName);// used ArrayList method contains() to check colour is available  or not
    }

    public boolean verifyColourPresentInList(String colour) {// Instance method
        boolean answer = false;

        for (String colourName : list) {// for-each loop
            if (colourName.equals(colour)) {
                answer = true;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Program_4_AddColoursWithArrayList obj = new Program_4_AddColoursWithArrayList();// created object to call instance method
        obj.addColours();// calling instance method
        //Print statements
        System.out.println(obj.isColourPresentInTheList("Green"));
        System.out.println(obj.isColourPresentInTheList("Black"));
        System.out.println(obj.isColourPresentInTheList("White"));
        System.out.println(obj.isColourPresentInTheList("Blue"));
        System.out.println(obj.verifyColourPresentInList("Purple"));
    }
}
