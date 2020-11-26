public class _10IfElse {
    public static void main(String[] args) {
        
        // If is block of code that run if the codition comes true as Below:
        if (10==10) {
            System.out.println("Hello");    
        }

        // Else is a block of code that runs if the if condition goes false as below:
        if (4>5) {
            System.out.println("True");
            
        }
        else
        {
            System.out.println("No 4 is not greater that 5");
        }


        // ElseIf is another block of code with codition to check as Follow:
        if (6<5) {
            System.out.println("Hi");
            
        }
        else if (6>5) {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Bye");
        }

        // Ternary operator is smaller version of if else
        System.out.println(5>6?"True":"False");
}
}
