package com.example.sis;

public class Main {
    public static void main(String[] args) {
        IStudent student1 = new Student("1", "manaswi");
        IStudent student2 = new Student("2", "megha");

        ICourse course1 = new Course("C1", "french");
        ICourse course2 = new Course("C2", "german");

        EnrollmentManager enrollmentManager = new EnrollmentManager();

        enrollmentManager.enrollStudentInCourse(student1, course1);
        enrollmentManager.enrollStudentInCourse(student1, course2);
        enrollmentManager.enrollStudentInCourse(student2, course1);

        System.out.println("Students in french (Course ID: " + course1.getCourseId() + "):");
        for (IStudent student : course1.getEnrolledStudents()) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }

        System.out.println("\nStudents in german (Course ID: " + course2.getCourseId() + "):");
        for (IStudent student : course2.getEnrolledStudents()) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
}
