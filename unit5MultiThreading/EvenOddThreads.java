package unit5MultiThreading;
/**
 * Main class to demonstrate coordinated printing of odd and even numbers
 * using two threads.
 */
public class EvenOddThreads {

    public static void main(String[] args) {
        
        // The maximum number to print
        final int MAX_NUMBER = 20;

        // Create a single shared printer object
        // This object contains the shared state (isOddTurn) and
        // the synchronized methods that threads will call.
        NumberPrinter printer = new NumberPrinter();

        // Create the task for the odd-number thread
        // This task will loop from 1 to MAX, incrementing by 2,
        // and call the printOdd() method.
        Runnable oddTask = () -> {
            for (int i = 1; i <= MAX_NUMBER; i += 2) {
                printer.printOdd(i);
            }
        };

        // Create the task for the even-number thread
        // This task will loop from 2 to MAX, incrementing by 2,
        // and call the printEven() method.
        Runnable evenTask = () -> {
            for (int i = 2; i <= MAX_NUMBER; i += 2) {
                printer.printEven(i);
            }
        };

        // Create the two threads, giving them descriptive names
        Thread oddThread = new Thread(oddTask, "OddThread");
        Thread evenThread = new Thread(evenTask, "EvenThread");

        // Start both threads
        // The JVM will schedule them to run, but the logic inside
        // NumberPrinter will control their execution order.
        oddThread.start();
        evenThread.start();
    }
}

/**
 * This class represents the shared resource that both threads will use.
 * It holds the logic for synchronization and communication.
 */
class NumberPrinter {

    // A boolean flag to control whose turn it is.
    // true = Odd thread's turn
    // false = Even thread's turn
    // We start with true because 1 (odd) is the first number.
    private volatile boolean isOddTurn = true;

    /**
     * This method is called by the "OddThread".
     * It is 'synchronized' to ensure only one thread can be inside
     * this (or printEven) method at a time.
     */
    public synchronized void printOdd(int number) {
        
        // Wait while it's NOT the odd thread's turn.
        // We use a 'while' loop here to protect against "spurious wakeups".
        // The thread might wake up even if notifyAll() wasn't called,
        // so it must re-check the condition.
        while (!isOddTurn) {
            try {
                // Releases the monitor lock and puts the current thread
                // into a waiting state until another thread calls notifyAll().
                wait();
            } catch (InterruptedException e) {
                // Handle the interruption
                Thread.currentThread().interrupt();
                System.err.println("OddThread was interrupted.");
            }
        }

        // At this point, the 'while' loop exited, meaning isOddTurn is true.
        // It is our turn to print.
        System.out.println(Thread.currentThread().getName() + ": " + number);

        // Flip the flag to false, giving the turn to the even thread.
        isOddTurn = false;

        // Wake up all threads that are waiting on this object's monitor.
        // In this case, it will wake up the "EvenThread".
        notifyAll();
    }

    /**
     * This method is called by the "EvenThread".
     * It is also 'synchronized' for mutual exclusion.
     */
    public synchronized void printEven(int number) {
        
        // Wait while it IS the odd thread's turn (i.e., not our turn).
        while (isOddTurn) {
            try {
                // Releases the lock and waits for the OddThread
                // to call notifyAll().
                wait();
            } catch (InterruptedException e) {
                // Handle the interruption
                Thread.currentThread().interrupt();
                System.err.println("EvenThread was interrupted.");
            }
        }

        // It's our turn.
        System.out.println(Thread.currentThread().getName() + ": " + number);

        // Flip the flag back to true, giving the turn to the odd thread.
        isOddTurn = true;

        // Wake up the "OddThread".
        notifyAll();
    }
}