package Practice7;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

class Student {
    private int ID;
    private String Name;
    private String Program;
    private List<CourseOffering> enrolledCourses;

    public Student(int id, String name, String program) {
        this.ID = id;
        this.Name = name;
        this.Program = program;
        this.enrolledCourses = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void enrollCourse(CourseOffering courseOffering) {
        enrolledCourses.add(courseOffering);
        System.out.println(Name + " enrolled in course offering: " + courseOffering.getCourseID());
    }

    public void displayEnrolledCourses() {
        if (enrolledCourses.isEmpty()) {
            System.out.println(Name + " is not enrolled in any courses.");
            return;
        }
        System.out.println(Name + "'s enrolled courses:");
        for (CourseOffering co : enrolledCourses) {
            co.displayDetails();
        }
    }
}

class Instructor {
    private int ID;
    private String Name;
    private String Department;
    private String Title;
    private List<CourseOffering> assignedCourses;

    public Instructor(int id, String name, String department, String title) {
        this.ID = id;
        this.Name = name;
        this.Department = department;
        this.Title = title;
        this.assignedCourses = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void assignCourse(CourseOffering courseOffering) {
        assignedCourses.add(courseOffering);
        System.out.println(Name + " assigned to teach course offering: " + courseOffering.getCourseID());
    }

    public void displayAssignedCourses() {
        if (assignedCourses.isEmpty()) {
            System.out.println(Name + " is not assigned to any courses.");
            return;
        }
        System.out.println(Name + "'s assigned courses:");
        for (CourseOffering co : assignedCourses) {
            co.displayDetails();
        }
    }
}

class Course {
    private int ID;
    private String Syllabus;
    private String Title;
    private String Credits;
    private String Prerequisite;

    public Course(int id, String syllabus, String title, String credits, String prerequisite) {
        this.ID = id;
        this.Syllabus = syllabus;
        this.Title = title;
        this.Credits = credits;
        this.Prerequisite = prerequisite;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return Title;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + ID);
        System.out.println("Title: " + Title);
        System.out.println("Syllabus: " + Syllabus);
        System.out.println("Credits: " + Credits);
        System.out.println("Prerequisite: " + Prerequisite);
    }
}

class CourseOffering {
    private int StudentID;
    private int InstructorID;
    private int CourseID;
    private Date Time;
    private int SectionNo;
    private int RoomId;
    private int Year;
    private String Semester;
    private Course course;
    private Student student;
    private Instructor instructor;

    public CourseOffering(int studentID, int instructorID, int courseID, Date time, int sectionNo, int roomId, int year, String semester) {
        this.StudentID = studentID;
        this.InstructorID = instructorID;
        this.CourseID = courseID;
        this.Time = time;
        this.SectionNo = sectionNo;
        this.RoomId = roomId;
        this.Year = year;
        this.Semester = semester;
    }

    public int getCourseID() {
        return CourseID;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void displayDetails() {
        System.out.println("Course Offering Details:");
        System.out.println("Course ID: " + CourseID);
        System.out.println("Student: " + (student != null ? student.getName() : "Not assigned"));
        System.out.println("Instructor: " + (instructor != null ? instructor.getName() : "Not assigned"));
        System.out.println("Time: " + Time);
        System.out.println("Section No: " + SectionNo);
        System.out.println("Room ID: " + RoomId);
        System.out.println("Year: " + Year);
        System.out.println("Semester: " + Semester);
        if (course != null) {
            course.displayDetails();
        }
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {
        Student student = new Student(1, "Alice", "Computer Science");
        Instructor instructor = new Instructor(101, "Dr. Smith", "Computer Science", "Professor");
        Course course = new Course(201, "Intro to Programming", "CS101", "3", "None");

        CourseOffering courseOffering = new CourseOffering(student.getID(), instructor.getID(), course.getID(), new Date(), 1, 301, 2025, "Spring");

        courseOffering.setCourse(course);
        courseOffering.setStudent(student);
        courseOffering.setInstructor(instructor);

        student.enrollCourse(courseOffering);
        instructor.assignCourse(courseOffering);

        courseOffering.displayDetails();

        student.displayEnrolledCourses();
        instructor.displayAssignedCourses();
    }
}