# Attendance Management Project

## Part 1

This repository contains the initial setup for the Attendance Management Project.

## How to run
1. Compile:
   ```bash
   javac src/com/school/Main.java

2. Run:
   ```bash
   java -cp src com.school.Main


---

## 📌 Part 2: Core Domain Modelling

### ✅ Changes Implemented

* Added **`Student` class** with:

  * `studentId`, `name`
  * `setDetails()` and `displayDetails()` methods
* Added **`Course` class** with:

  * `courseId`, `courseName`
  * `setDetails()` and `displayDetails()` methods
* Updated **`Main.java`**:

  * Created arrays of `Student` and `Course` objects
  * Demonstrated `this` keyword usage
  * Displayed multiple students and courses

---

### 🛠️ How to Run

1. Navigate to project root.
2. Compile:

   ```bash
   javac src/com/school/*.java
   ```
3. Run:

   ```bash
   java -cp src com.school.Main
   ```

---

### 🎯 Learning Outcomes

* Practiced **object-oriented design** with `Student` and `Course`.
* Learned how to use **arrays of objects**.
* Reinforced the concept of **`this` keyword** in Java.

---

## Part 3: Constructor Initialization & Auto-ID Generation
- Implemented parameterized constructors in `Student` and `Course` classes for object initialization.
- Utilized `private static` member variables for automatic and unique ID generation.
- Demonstrated the use of the `this` keyword to distinguish instance variables from constructor parameters.
- Changed `Course`'s `courseId` to `int` for simpler auto-generation and updated its display.
- Updated `Main.java` to use constructors and show ID progression.

### How to Run (ensure this is up-to-date)
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/Student.java src/com/school/Course.java src/com/school/Main.java` (or `javac src/com/school/*.java`)
3. Run: `java -cp src com.school.Main`

---

