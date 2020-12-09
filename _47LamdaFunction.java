// LAmbda is short block of code that take a parameter and return the the value.
// Lambda is also shorter version of method but it dont have any name.
// Syntax-> parameter->expression
// lambda function has to immediatly return a value and cant have any variables.
import java.util.ArrayList;
import java.util.function.Consumer;

public class _47LamdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(45);
        numbers.add(36);
        numbers.add(78);
        numbers.add(56);
        // Here below we have used the lamda function.
        numbers.forEach((n)->System.out.println(n));

        // To return the value in lambda function it should have return type.
        // An as we know it dont have any name and all.
        // So if we have to store the value of the lamda we will use the variable with type interface.
        // So we have here Consumer class that will help us. 
        Consumer<Integer> consumer = (n)->System.out.println(n);
        System.out.println("--------------");
        numbers.forEach(consumer);
    }
}
