# Peterson’s Algorithm: Critical Section Problem Solution

This project demonstrates the **Critical Section Problem** in multithreading and provides a software-based solution using **Peterson’s Algorithm**. Developed for the **IT2106 – Operating Systems** module.

---

### 🎓 Academic Context
* **Institution:** CINEC Campus
* **Course:** BSc (Hons) Software Engineering
* **Module:** IT2106 – Operating Systems
* **Assignment:** Group Project - Batch 05
* **Due Date:** 17th January 2026

---

### 📝 Project Overview
In this project, the Critical Section issue in multithreading is demonstrated. It has two versions:
* **Unsynchronized Version:** This is what happens when a race condition occurs.
* **Synchronized Version:** Displays the way the Algorithm by Peterson manages to solve the problem.

---

### 📂 Project Structure
The project contains two major folders:

1.  **UnsynchronizedVersion**
    * `Main.java` - Entry point for the unsynchronized execution.
    * `Counter.java` - Holds the shared data and the critical section.
    * `ProcessThread.java` - Represents the thread adding to the shared counter.

2.  **SyncronizedVersion**
    * `Main.java` - Entry point for the Peterson's algorithm solution.
    * `PetersonAlgorithm.java` - Core logic for thread synchronization.
    * `Mycounter.java` - The shared counter used in the synchronized version.
    * `ProcessThread.java` - Thread implementation that utilizes Peterson's locks.

---

### ⚙️ How to Compile and Run
You need to open your **IntelliJ IDEA Community Edition** and do the following:

#### 🔴 To execute Unsynchronized Version:
1.  Select `UnsynchronizedVersion` folder.
2.  **Compile:** `javac Main.java`
3.  **Run:** `java Main`

#### 🟢 To execute Synchronized Version (Solution of Peterson's Algorithm):
1.  Open the `SyncronizedVersion` folder.
2.  **Compile:** `javac Main.java`
3.  **Run:** `java Main`

---

### 📊 Expected Results
| Version | Description | Expected Final Count | Actual Final Count |
| :--- | :--- | :--- | :--- |
| **Unsynchronized** | Race condition occurs | 200,000 | **Under 200,000** (e.g. 185,432) |
| **Synchronized** | Peterson's Solution | 200,000 | **Exactly 200,000** |

---

### ✅ Synchronization Requirements Met
* **Mutual Exclusion:** Guaranteed via `flag` and `turn` variables.
* **Progress:** Threads can enter the critical section if it is free.
* **Bounded Waiting:** The `turn` variable ensures fairness and prevents starvation.

---
**Note:** In `PetersonAlgorithm.java`, the `volatile` keyword is used to ensure memory visibility between threads.
