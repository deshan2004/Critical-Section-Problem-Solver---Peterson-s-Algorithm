package SyncronizedVersion;
class Counter {
    int count = 0;

    void increment(int id) {
        PetersonAlgorithm.enter(id); // entry section
  //request to join critical section
        count++; //critical section
// critical section end
        PetersonAlgorithm.exit(id);  //exit section
    }
}