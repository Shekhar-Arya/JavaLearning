public class _32InnerClassExampleMainClass {
    
    public static void main(String[] args) {
       
        // This is how we will create a outer class object.
        _32OuterClass outer = new _32OuterClass();
        
        // This is example of creation of inner class object.
        _32OuterClass._32InnerClass inner = outer.new _32InnerClass();

        // This is how we will access the elements of the outer and inner class.
        System.out.println(outer.x + inner.y);

        // Now below example is the example of how to access outer class value from inner class.
        System.out.println(inner.OuterClassValue());


        // If inner class is private than there will be an error while creating object of it and accessing it.
        // If inner class is static than we can access the inner class directly without creating an object of the outer class.
        // OuterClass.InnerClass myInner = new OuterClass.InnerClass(); Like this.
        // But just like static attributes and methods, a static inner class does not have access to members of the outer class.
    }
}
