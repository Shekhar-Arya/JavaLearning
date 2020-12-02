public class _31PolymorphismHolla extends _31Polymorphism {
    //@Override
    // by this we can use different form of the original class.
    // This is known as polymorphism.
    public void SaysHello() {
        System.out.println("Holla");
        // By using this super keyword we can access the original form of the method or constructor of super class.
        super.SaysHello();
    }
    public static void main(String[] args) {
        // Here we have same formate of base class and child class only difference is form.
        _31Polymorphism obj = new _31PolymorphismHolla();
        _31Polymorphism obj1 = new _31Polymorphism();
        obj1.SaysHello();
        obj.SaysHello();
    }
}
