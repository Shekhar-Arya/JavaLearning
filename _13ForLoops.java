public class _13ForLoops {
    public static void main(String[] args) {
        
        // For loop is also a block of code that executes until the condition comes true
        // Syntax
        for(int i = 0; i<10; i++)
        {
            System.out.println(i);
        }

        // Another example
        for(int i = 0; i<10; i+=2)
        {
            System.out.println(i);
        }

        // For-each is also a kind of for loop which helps us to easyliy,
        // iterate through lists or arrays as example below:
        String[] s = {"hi","hello", "hola", "Bye"};
        for (String i : s) {
            System.out.println(i);
        }
    }
}
