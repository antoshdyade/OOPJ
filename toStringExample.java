class Student{
	String Name;
	int age;
	float page;
	public Student(String n, int a, float p) {
		Name=n;
		age=a;
		page=p;
	}
	public String toString() {
		return "{Name: "+this.Name+", Age: "+this.age+", Percentage: "+this.page+"}";
	}
}

public class toStringExample {

	public static void main(String[] args) {
		Student s1=new Student("Antosh",18,85.5f);
		System.out.println(s1);
		
		Student s2=new Student("Krishna",9,90.2f);
		System.out.println(s2);

	}

}
