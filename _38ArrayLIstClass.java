
// ArrayList class is resizable array found in java.util package.
import java.util.ArrayList;

// For Sorting;
import java.util.Collections;

public class _38ArrayLIstClass {
    public static void main(String[] args) {
        // Create an object of the ArrayList as Below:
        ArrayList<String> cars = new ArrayList<String>();
        // ArrayList Has many usefull method
        // One of its add() which is used to add elemnt in ArrayList.

        cars.add("Volvo");
        cars.add("RR");
        cars.add("Porche");
        // One way to print ArrayList
        System.out.println(cars);

        // Access an element of the ArrayList as Below:
        System.out.println(cars.get(1));
        // Remember: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

        // Change an item of the arrayList as below.
        cars.set(0, "Lamborgini");
        System.out.println(cars.get(0));

        // To remove the element of the arryaList we will use remove() method:
        cars.remove(2);
        System.out.println(cars);

        // To check the size of an ArrayList use size() method;
        System.out.println(cars.size());

        // Loop through for loop this ArrayList
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("THis is for loop: "+cars.get(i));
        } 

        //Loop through for-Each loop
        for (String string : cars) {
            System.out.println("This is for Each loop: "+string);
        }

        // We can have ArrayList of any type;
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(10);
        i.add(9);
        i.add(7);
        System.out.println(i);

        // Sort an ArrayList we will use Collections Class for sorting ArrayList.
        System.out.println("Before Sorting: " +cars);
        Collections.sort(cars);
        System.out.println("After sorting: "+cars);
        
        System.out.println("Before sorting: "+i);
        Collections.sort(i);
        System.out.println("Afte sorting: "+i);


        // To remove all the element of The ArrayList we will use clear() method as below:
        cars.clear();
        System.out.println(cars);


    }
}
