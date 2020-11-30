public class _25Constructor {
    
    // Constructor is a specialized type of the method which has same name as Class name,
    // And no return type like void and all.

    // This constructor is directly and autoamtically called when and object of the class is created.
    int x;
    // This is how we create a constructor
    public _25Constructor(int a)
    {x = a;}

    public static void main(String[] args) {
        
        // Now when we create a object of the class we actually call the constructor;
        _25Constructor obj = new _25Constructor(10);
        System.out.println(obj.x);

        // Now when we create different object all will have different value as provided.
        _25Constructor obj2 = new _25Constructor(20);
        System.out.println(obj2.x);

        // We can also have as many parameter passed in the constructor as we want.
    
    }


}
