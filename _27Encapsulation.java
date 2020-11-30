
public class _27Encapsulation {
    
    // Encapsulation means "To hide Sensetive data"
    // It means to declare a variable with private access modifier, which have access to only itself class.
    // And to get a value or set the value to that variable we will use the get set method.

    // Get method will return the value of the variable.
    // Set method will set the value to the variable.
    
    // Get Set method name should start with "get" or "set" followed by variable name.

    // Example as below>
    private String name;
    // This is getter method.
    public String getName() {
        return name;
    }
    // This is setter method.
    public void setName(String name) {
        // this keyword is used to give refrence to the main variable.
        this.name = name;
    }

    public static void main(String[] args) {
        
        // In main method if we create an object of the class and try to access the variable,
        // Then it will genrate an error
        _27Encapsulation obj = new _27Encapsulation();
        //System.out.println(obj.name); this will create an error

        // But we can use the getter and setter method to get and set value.
        obj.setName("Shekhar");
        System.out.println(obj.getName());
    
        
        /*
        Why Encapsulation?
        Better control of class attributes and methods  
        Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
        Flexible: the programmer can change one part of the code without affecting other parts
        Increased security of data
        */
    }
}
