/*
Concurrency Problems
Because threads run at the same time as other parts of the program, there is no way to know in which order the code will run. 
When the threads and main program are reading and writing the same variables, 
the values are unpredictable. The problems that result from this are called concurrency problems.
*/

public class _46ThreadsCOncurrencyProblem extends Thread {
    public static int amount = 0;
    @Override
    public void run() {
        amount++;
    }

    public static void main(String[] args) {
        _46ThreadsCOncurrencyProblem thread = new _46ThreadsCOncurrencyProblem();
        thread.start();
        // So here the problem will occured that is discussed above.
        System.out.println("THis is amount after thread "+amount);

        amount++;
        System.out.println("THis is amount after outside thread "+amount);
    }
}

// To check the solution comment above program and uncooment below one.


/*public class _46ThreadsCOncurrencyProblem extends Thread {
    public static int amount = 0;
    @Override
    public void run() {
        amount++;
    }

    public static void main(String[] args) {
        _46ThreadsCOncurrencyProblem thread = new _46ThreadsCOncurrencyProblem();
        thread.start();
        // Here we will wait till the thraed is finished
        while (thread.isAlive()) {
            System.out.println("Wait....");
        }
        // Value will be updated here.
        System.out.println("THis is amount after thread "+amount);

        amount++;
        System.out.println("THis is amount after outside thread "+amount);
    }
}*/