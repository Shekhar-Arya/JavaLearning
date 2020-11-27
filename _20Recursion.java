public class _20Recursion {
    
    // Recursion is technique which is achieved when one method call itself again and again until its stopping point.
    // Recursion method with no breaking point can cause a program to run infinite and crash it.
    
    public static int Recursion(int x) {
        if (x>0) {
            return x+Recursion(x-1);
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Recursion(5));
    }
}
