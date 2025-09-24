package com.school;

public class Main {
    public static void main(String[] args) {
        // Students
        Student[] students = {
            new Student("Alice"),
            new Student("Bob"),
            new Student("Charlie")
        };

        // Courses
        Course[] courses = {
            new Course("Mathematics"),
            new Course("Science"),
            new Course("History")
        };

        // Display Students
        System.out.println("=== Students ===");
        for (Student s : students) {
            s.displayDetails();
        }

        // Display Courses
        System.out.println("=== Courses ===");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}
