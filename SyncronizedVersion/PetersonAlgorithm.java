package SyncronizedVersion;

class PetersonAlgorithm {
    //volatile is essential to ensure that data is exchanged instantly between two threads.
    private static volatile boolean[] flag = new boolean[2];
    private static volatile int turn = 0;

    public static void enter(int i) {
        int j = 1 - i; //ID of the other thread
        flag[i] = true; //Current thread expresses interest to enter
        turn = j;    // Give turn to the other thread

// Wait as long as the other thread needs to enter, now it's their turn.
                  while (flag[j] && turn == j) {
            // Busy wait (Waiting for the critical section to become free)
        }
    }

    public static void exit(int i) {
        flag[i] = false;     // Finished, now the other thread can enter
    }
}