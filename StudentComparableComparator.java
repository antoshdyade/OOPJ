import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Student class representing a student
class Student implements Comparable<Student> {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implementing Comparable interface based on age
    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.age, otherStudent.getAge());
    }

    // Override toString method for better printing
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
    // Custom comparator based on name
    public static Comparator<Student> NameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getName().compareTo(student2.getName());
        }
    };
}

public class StudentComparableComparator {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20));
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 18));

        // Sort the students based on their natural order (age)
        Collections.sort(students);
        System.out.println("Sorted by age (natural order):");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort the students based on name using Comparator
        Collections.sort(students, Student.NameComparator);
        System.out.println("\nSorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
