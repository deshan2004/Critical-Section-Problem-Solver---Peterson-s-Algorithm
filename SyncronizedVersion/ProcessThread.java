package SyncronizedVersion;

class ProcessThread extends Thread {
    Counter resource;
    int id;

    ProcessThread(Counter resource, int id) {
        this.resource = resource;
        this.id = id;
    }

    @Override
    public void run() {
        // Each thread will try to increment the counter 100,000 times.
        for (int i = 0; i < 100000; i++) {
            resource.increment(id);
        }
    }
}
