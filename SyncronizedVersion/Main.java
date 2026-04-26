package SyncronizedVersion;
public class Main {
    public static void main(String[] args) throws Exception {
        Counter resource = new Counter();
// Creating two process threads
        ProcessThread t1 = new ProcessThread(resource, 0);
        ProcessThread t2 = new ProcessThread(resource, 1);

        System.out.println("Starting Peterson's Algorithm Implementation...");

        t1.start();
        t2.start();
        // Wait for both threads to finish before  the final result
        t1.join();
        t2.join();

        // Final count should be exactly 200,000
        System.out.println("Final Count : " + resource.count);

        if(resource.count == 200000) {
            System.out.println("Status: Success! No Race Condition.");
        } else {
            System.out.println("Status: Failed! Data inconsistency detected.");
        }
    }
}