package sveri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        // Compare based on age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ComparatorComparableEx1 {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("John", 30));
        peopleList.add(new Person("Alice", 25));
        peopleList.add(new Person("Bob", 35));

        // Sorting using Comparable (by age)
        System.out.println("Sorted by age (Comparable):");
        Collections.sort(peopleList);
        for (Person person : peopleList) {
            System.out.println(person);
        }

        // Sorting using Comparator (by name)
        System.out.println("\nSorted by name (Comparator):");
        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        Collections.sort(peopleList, nameComparator);
        for (Person person : peopleList) {
            System.out.println(person);
        }
    }
}
