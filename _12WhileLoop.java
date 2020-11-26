public class _12WhileLoop {
    public static void main(String[] args) {
        
        // While loop is a block of code that run until the codition is true:
        int i = 0;
        while (i<5) {
            System.out.println(i);
            i++;
        }

        // Do while loop is same as the whle loop just with one differnce;
        // it will execute the code once then it will check the condition.
        int x = 5;
        do {
            System.out.println(x);
            x++;
        } while (x<5);
    }
}
