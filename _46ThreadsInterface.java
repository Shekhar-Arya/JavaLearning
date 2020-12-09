// we seen threads by extending thraed class now we will seeby implementing Runnable interface.
public class _46ThreadsInterface implements Runnable{
    
    // same as thraed we need to use run() method to use threads
    @Override
    public void run() {
        System.out.println("This is thread running");
        
    }
    public static void main(String[] args) {
        _46ThreadsInterface thread = new _46ThreadsInterface();
        // but here we will create object of the class also to use thraeds and pass class object in it.
        Thread th = new Thread(thread);
        th.start();

        System.out.println("This code is outside of the thread");
    
    }
}
