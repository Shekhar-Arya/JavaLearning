//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
//It is called an "iterator" because "iterating" is the technical term for looping.
// We can get the iterator from class Iterator from util package;
import java.util.Iterator;
import java.util.ArrayList;

public class _42Iterator {
    public static void main(String[] args) {
        
        // Here we make an arrayList First:
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("RR");
        cars.add("Porche");
        cars.add("Lambo");

        // Here we will create an Iterator object of the cars ArrayList;
        // By iterator() method we are able to create an Iterator.
        Iterator<String> it = cars.iterator();
        System.out.println(it);

        // This will print the first element of the iterator.
        System.out.println(it.next());

        // Looping through the iterator we will use hasNext() method.
        // This method will check if this iterator has next item if true then go and print it.
        while (it.hasNext()) {
            System.out.println(it.next());
        } 

        // Removing the item from the iterator
        while (it.hasNext()) {
            String i = it.next();
            if (i=="Volvo") {
                it.remove();
            }
        }
        System.out.println(it);
        // Note: Trying to remove items using a for loop or a for-each loop would not work correctly because,
        // the collection is changing size at the same time that the code is trying to loop.
    }
}
