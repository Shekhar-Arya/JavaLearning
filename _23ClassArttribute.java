public class _23ClassArttribute {
    
    // This is known as the class attribute also known as the fields.
    int x = 10;
    int y = 20;

    // When we declare a variable with final modifier then we can access the variable,
    // by creating the object of the class but we cant modify the the variable or class attribute.
    final int z = 30;

    public static void main(String[] args) {
        
        // This is how will access the class attribute
        _23ClassArttribute obj1 = new _23ClassArttribute();
        System.out.println(obj1.x + obj1.y);

        // This is how we modify the class atrribute.
        obj1.x = 50;
        obj1.y = 50;
        System.out.println(obj1.x + obj1.y);

        _23ClassArttribute obj2 = new _23ClassArttribute();
        // Change in class atrribute of the object obj1 will not change the class attribute of another object,
        // as shown below:
        System.out.println(obj2.x + obj2.y);

    }


}
