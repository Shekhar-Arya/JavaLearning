// HashSet is a collection of the item that are completely unique.
// We can import the class the HashSet as below:
import java.util.HashSet;

public class _41HashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("RR");
        // If we add duplicate value than too it will remove and keep only single unique value.
        cars.add("RR");
        cars.add("Porche");
        System.out.println(cars);

        // To check if an particular item exits in Hashset we can see with contains() method
        System.out.println(cars.contains("RR"));

        // To remove an element we will use remove keyword:
        cars.remove("Volvo");
        System.out.println(cars);

        // To get the size of the Hashset we will use size() method
        System.out.println(cars.size());

        // loop through hashset
        for (String string : cars) {
            System.out.println(string);
        }

        // To create hashset of different data types;
        HashSet<Integer> value = new HashSet<Integer>();
        value.add(20);
        value.add(30);
        value.add(5);

        for (int i = 0; i<=20; i++) {
            if (value.contains(i)) {
                System.out.println("This Hashset contains: "+i);
            }
        }

        // We can also remove all the element of the Hashset by clear() method.
        value.clear();
        System.out.println(value);
    }
}
