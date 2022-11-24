package Assi_7th_2411;


import java.util.ArrayList;
import java.util.List;

class Student
{
	int id;
	String Name;
	int age;
	int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int id, String name, int age, int marks) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.marks = marks;
	}
	public static Iterable<Student> stream() {
		
		return null;
	}
	
}

public class studentMarks {

	public static void main(String[] args) {
		List<Student> obj=new ArrayList<>();
		obj.add(new Student(1,"Suraj G",22,99));//to add new student data
		obj.add(new Student(2,"Rupesh S",22,89));//to add new student data
		obj.add(new Student(3,"Saurabh J",22,79));//to add new student data
		obj.add(new Student(4,"Divesh K",22,69));//to add new student data
		obj.add(new Student(5,"Prajwal O",22,59));//to add new student data
		
		obj.stream().forEach(j->System.out.println("Student Id-"+j.getId()+" "+"Name-"+j.getName()+" "+"Age"+j.getAge()+" "+"Marks"+j.getMarks()));
		//for each loop to get all student info
		
		System.out.println("Sutdents which are having marks between 60 to 80 are ");
		//it will print Sutdents which are having marks between 60 to 80 are
		
		obj.stream().filter(p->p.getMarks()<80).filter(p->p.getMarks()>60).forEach(s->System.out.println(s.getName()+" "+s.getMarks()));
		//stream method to get student marks  

	}

}