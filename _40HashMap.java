
// As we studied in ArrayList the data is stored in sequence and we access the data by the index value.
// In this hashMap we store data in KeyValue pair. One value will be the key and one value will be Value of that key.
// By the help of the Key we will be able to access the Value

// First we will iport the Hashmap
import java.util.HashMap;

public class _40HashMap {
    public static void main(String[] args) {
        
        // This is how we will create an hashmap of key value.
        // Here key is of String data type and value is also of String data type.
        HashMap<String, String> ShekharDetail = new HashMap<String, String>();

        // To Add the elements in the Hashmap we will use put() method.
        // Eg. as below:
        ShekharDetail.put("Name", "Shekhar");
        ShekharDetail.put("Age", "20");
        ShekharDetail.put("College", "Socet");
        System.out.println(ShekharDetail);

        // To access the element of the hashmap we will use get() method,
        // By passng key to the get() method.
        System.out.println(ShekharDetail.get("Name"));

        // To remove an element we will use remove(),
        // And we will pass key of the value which we have to delete.
        ShekharDetail.remove("Age");
        System.out.println(ShekharDetail);

        // To get the size of the Hashmap we simply use size() method;
        System.out.println(ShekharDetail.size());

        // Loop through for-each loop beacuse its easy with foor-each loop;
        // By .keySet() we will be able access keys of the hashmap 
        for (String key : ShekharDetail.keySet()) {
            System.out.println("These are the keys of the hashMAp: "+key);
        }
        // By use of .values() we are able to access the values
        for (String value : ShekharDetail.values()) {
            System.out.println("These are the values f the hashMAp: "+value);
        }

        // We can use both key and value at once like the below:
        for (String string : ShekharDetail.keySet()) {
            System.out.println("Key is: "+string+" Value is: "+ShekharDetail.get(string));
        }

        // We can create any combination of the data type in creating Hashmap
        // As below:
        HashMap<String,Integer> NameAge = new HashMap<String,Integer>();
        NameAge.put("Shekhar", 20);
        NameAge.put("Jay", 17);
        NameAge.put("Niru", 40);
        System.out.println(NameAge);

        // To remove all the elemnts of the we will use clear() method
        NameAge.clear();
        System.out.println(NameAge);
    }
}
