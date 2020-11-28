// This is an Example of how to create a class.
public class _22ClassesAndObject {

    int x = 10;

    public static void main(String[] args) {
        
        // Example to create an object of the class.
        _22ClassesAndObject obj1 = new _22ClassesAndObject();
        System.out.println(obj1.x);

        // We can create as many object of the class as all we want.
        _22ClassesAndObject obj2 = new _22ClassesAndObject();
        System.out.println(obj2.x);

        // This is where we will call the class Inner_22ClassesAndObject and makes it object.
        Inner_22ClassesAndObject obj = new Inner_22ClassesAndObject();
        System.out.println(obj.x);
    }
}

// This is example of how we can use multiple class.
// See class Inner_22ClassesAndObject for this multiple class. 