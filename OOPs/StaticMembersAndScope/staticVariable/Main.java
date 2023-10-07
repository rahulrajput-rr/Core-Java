// package staticVariable;

import java.util.Scanner;

class Student {
    String name;
    String student_id;
    public String sname;
    static String course = "Computer Science"; // static variable

    Student(String name, String student_id) {
        this.name = name;
        this.student_id = student_id;
        // this.course = course;// has no effect on students course
    }

    // just return not to display the student
    String displayDetails() {
        return ("name: " + name + " student_id: " + student_id + " course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the student_id: ");
        String student_id = scanner.nextLine();
        Student student = new Student(name, student_id);

        student.displayDetails();

        System.out.println(
                "Student Name: " + student.name + "\tStudent Id:  " + student.student_id + "\tCourse:  "
                        + student.course);
    }
}
