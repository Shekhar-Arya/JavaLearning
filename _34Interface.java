// Interface is another way to achieve abstraction.
// interface is completely abstarct class with all realted methodds with empty bodies.
// To create interface we must use keyword "interface"

// As we know we cant craete an object of the interface same as the abstract class.
// so we have to implement it to the different class. same as we inherit class.
// Implementation is done by the keyword "implement".

// This is how we craete an interface.
interface inner_34Interface
{
    public void name();
    public void age(); 
}

interface inner2_34Interface
{
    public void college();
}

// We can access multiple interface by implementing them but not multiple inheritance of the class by extending them.
public class _34Interface implements inner_34Interface, inner2_34Interface{
    @Override
    public void name() {
        System.out.println("Shekhar");
    }

    @Override
    public void age() {
        System.out.println(20);
    }
    
    @Override
    public void college() {
     System.out.println("SOCET");   
    }

    public static void main(String[] args) {
        
        _34Interface obj = new _34Interface();
        obj.name();
        obj.age();
        obj.college();
    }    
}

/*
Main Importartant notes to see about interface.

->Like abstract classes, interfaces cannot be used to create objects
(in the example above, it is not possible to create an "Animal" object in the MyMainClass)

->Interface methods do not have a body - the body is provided by the "implement" class

->On implementation of an interface, you must override all of its methods

->Interface methods are by default abstract and public

->Interface attributes are by default public, static and final

->An interface cannot contain a constructor (as it cannot be used to create objects)
 */

/*
Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass).
However, it can be achieved with interfaces, because the class can implement multiple interfaces.
Note: To implement multiple interfaces, separate them with a comma (see example below).
*/