// Threads are used to craete a program to operate more efficiently by doig multiple things at same time.
// threads can be used to do complicated tasks in background and without interrupting main program.

// Create a thread.
// 1. we can create by extending thread class to main class.
// 2. we can create by implementing Runnable interface to the main class.

// This is example of extending thread class
public class _46Threads extends Thread {
    
    // to use thread we need to override its run()  method and perform action in it.
    @Override
    public void run() {
        System.out.println("This is thread running now.");
        //super.run();
    }

    public static void main(String[] args) {
        
        // to run the thread we have to create an object of the class and call the start() method.
        _46Threads thread = new _46Threads();
        thread.start();

        // this is code outside the thraed.
        System.out.println("This is outside code.");
    }
}
