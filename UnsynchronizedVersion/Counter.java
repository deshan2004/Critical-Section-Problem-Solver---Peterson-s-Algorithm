package UnsynchronizedVersion;
// This class holds the shared data
class Counter {
    private int count = 0;

    //  This is the Critical Section.
    //  Without synchronized, two threads will overwrite each other's work.
    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}



