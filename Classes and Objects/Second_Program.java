import java.util.*;
public class Second_Program {
    public static void main(String[] args) {
        Student student = new Student("John Doe");

        Course course1 = new Course("Mathematics", 3);
        Course course2 = new Course("Physics", 4);

        student.addCourse(course1);
        student.addCourse(course2);

        student.displayDetails();
    }
}

 class Course {
    String courseName;
    int credits;
    
    public Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }
}

class Student {
    String name;
    ArrayList<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println("Course Name: " + course.getCourseName() + ", Credits: " + course.getCredits());
        }
    }
}

