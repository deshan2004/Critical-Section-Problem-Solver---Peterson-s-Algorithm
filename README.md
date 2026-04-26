# Critical Section Problem & Peterson's Algorithm Solution

This project is a practical demonstration of synchronization mechanisms in Operating Systems, specifically focusing on solving the **Critical Section Problem** using **Peterson's Algorithm**.


## 📌 Project Overview
[cite_start]The goal of this project is to demonstrate how synchronization mechanisms work to manage shared resources between multiple threads[cite: 10]. We have implemented two versions of a counter incrementation program:

1.  **Unsynchronized Version**: Demonstrates a **Race Condition** where two threads (t1 and t2) overwrite each other's work while incrementing a shared counter to 200,000.
2.  [cite_start]**Synchronized Version**: Implements **Peterson’s Algorithm** (a software-based solution for two processes) to ensure the counter reaches the exact expected value[cite: 17, 25].

## 🛠️ Implementation Details
[cite_start]The solution satisfies the three fundamental requirements of the critical-section problem[cite: 10, 11]:

* **Mutual Exclusion**: Only one thread accesses the critical section (the `increment()` method) at a time using `flag` and `turn` variables.
* **Progress**: If no thread is in the critical section, a thread wishing to enter can do so without being blocked by processes outside the critical section.
* **Bounded Waiting**: The `turn` variable ensures that no thread waits indefinitely to enter its critical section, as it gives the "turn" to the other process after setting its own flag.

## 📂 Project Structure
* `UnsynchronizedVersion/`: Contains the original code demonstrating the race condition.
* `SyncronizedVersion/`: Contains the fixed implementation using Peterson's Algorithm.
* `PetersonAlgorithm.java`: The core synchronization logic using `volatile` variables to ensure instant data exchange.

## 🚀 Compilation and Execution
To run the project, ensure you have Java installed and follow these steps:

### Running Unsynchronized Version
```bash
javac UnsynchronizedVersion/*.java
java UnsynchronizedVersion.Main
