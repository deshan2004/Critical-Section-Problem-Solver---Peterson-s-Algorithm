package UnsynchronizedVersion;

// This class represents a thread

class ProcessThread extends Thread {
    private Counter sharedCounter;

    public ProcessThread(Counter sharedCounter) {

        this.sharedCounter = sharedCounter;
    }

    @Override
    public void run() {
// Each thread tries to add 1 to the counter 100,000 times
            for (int i = 0; i < 100000; i++) {
            sharedCounter.increment();
        }
    }
}
