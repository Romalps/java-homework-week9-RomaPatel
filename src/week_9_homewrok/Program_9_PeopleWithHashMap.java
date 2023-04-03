package week_9_homewrok;

import java.util.HashMap;
import java.util.Map;

/*
9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */
public class Program_9_PeopleWithHashMap {
    public static void main(String[] args) {

        Program_9_PeopleWithHashMap people = new Program_9_PeopleWithHashMap();
        people.peopleMap();
    }

    public void peopleMap() {// instance method
        // create hashmap object called people
        HashMap<String, Integer> people = new HashMap<>();
        //Add name in the key and age in the value
        people.put("Akta", 30);
        people.put("Dhara", 35);
        people.put("Ishita", 24);
        people.put("Hiral", 39);
        people.put("Parul", 40);
        people.put("Khushi", 30);
        //Use for-each  loop to iterate the value from map
        for (String i : people.keySet()) {
            System.out.println("Name(key): " + i + "   Age(Value): " + people.get(i));
        }
    }

}
