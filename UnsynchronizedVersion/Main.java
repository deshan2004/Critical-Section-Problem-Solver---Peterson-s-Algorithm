package UnsynchronizedVersion;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Creating two threads t1 and t2
        ProcessThread t1 = new ProcessThread(counter);
        ProcessThread t2 = new ProcessThread(counter);

        System.out.println("Starting Unsynchronized Execution...");

        t1.start();
        t2.start();

        try {
            // Waiting for threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }

        // // Output will be less than 200,000 because of the race condition
        int expectedValue = 200000;
        int actualValue = counter.getCount();

        System.out.println("Expected Final Count: " + expectedValue);
        System.out.println("Actual Final Count:   " + actualValue);
        System.out.println("Difference (Lost Updates): " + (expectedValue - actualValue));

        System.out.println("Status: Race Condition Demonstrated Successfully.");
    }
}