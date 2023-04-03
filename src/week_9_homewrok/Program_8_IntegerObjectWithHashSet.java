package week_9_homewrok;

import java.util.HashSet;

/*
8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
else)
 */
public class Program_8_IntegerObjectWithHashSet {

    public static void main(String[] args) {

        Program_8_IntegerObjectWithHashSet object = new Program_8_IntegerObjectWithHashSet();
        object.integerObject();
    }
    public void integerObject() {
        // create hashset object called set
        HashSet<Integer> set = new HashSet<>();
        set.add(4);// add vales to the set
        set.add(7);
        set.add(8);
        // show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + " is found in the set.");
            } else {
                System.out.println(i + " is not found in the set.");
            }
        }
    }
}
