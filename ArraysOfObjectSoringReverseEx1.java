package amd;
import java.util.*;

class Student {
    private int rno;
    private String name;
    private float page;

    public Student(int rno, String name, float page) {
        this.rno = rno;
        this.name = name;
        this.page = page;
    }

    public int getRno() {
        return this.rno;        
    }

    public String getName() {
        return this.name;
    }

    public float getPage() {
        return this.page;
    }
}

public class ArraysOfObjectSoringReverseEx1 {

    public static void main(String[] args) throws Exception {

        Student[] s1 = new Student[20];

        s1[0] = new Student(1, "Ramesh", 87.5f);
        s1[1] = new Student(2, "Rajesh", 76.4f);
        s1[2] = new Student(3, "Suresh", 92.4f);
        s1[3] = new Student(4, "Ganesh", 76.4f);

        // Sorting array of students by page
        Arrays.sort(s1, 0, 4, Comparator.comparing(Student::getPage).thenComparing(Student::getName).reversed());

      

        System.out.println("Sorted array of students by page:");
        for (int i = 0; i < s1.length && s1[i] != null; i++) {
            System.out.println("R.No.: " + s1[i].getRno() + ", Name: " + s1[i].getName() + ", Page: " + s1[i].getPage());
        }

    }
}