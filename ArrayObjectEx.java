package SY2024;
class PersonDetails {
    String Name;
    int age;
}

public class ArrayObjectEx {

    public static void main(String[] args) {
        
        PersonDetails p[] = new PersonDetails[10];

        // Create new instances of PersonDetails for each array element
        for (int i = 0; i < p.length; i++) {
            p[i] = new PersonDetails();
        }
        
        p[0].Name = "Antosh";
        p[0].age = 47;
        p[1].Name = "Krishna";
        p[1].age = 8;
        p[2].Name="Mahadev";
        p[2].age=4;

        for (PersonDetails x : p) {
            if (x != null) {
                System.out.print(x.Name+" ");
                System.out.println(x.age);
            }
        }   
    }
}
