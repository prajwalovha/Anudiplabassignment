package Assi_7th_2411_2;

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
	
}

public class maxMinMarks {

	public static void main(String[] args) {
		List<Student> obj=new ArrayList<>();
		obj.add(new Student(1,"Suraj G",22,99));//to add new student data
		
		obj.add(new Student(2,"Rupesh S",22,89));//to add new student data
		
		obj.add(new Student(3,"Saurabh J",22,79));//to add new student data
		
		obj.add(new Student(4,"Divesh K",22,69));//to add new student data
		
		obj.add(new Student(5,"Prajwal O",22,59));//to add new student data
		
		       //max marks wale Students
				Student pa=obj.stream().max((Agent1,Agent2)->Agent1.getMarks()>Agent2.getMarks()?1:1).get();
				System.out.println("Student with maximum marks ");
				System.out.println("Name-"+pa.getName()+" "+"Marks-"+pa.getMarks()); 
				
				
				 //min marks wale Students
				Student pn=obj.stream().min((Agent1,Agent2)->Agent1.getMarks()>Agent2.getMarks()?1:1).get();
				System.out.println("Student with minimum marks ");
				System.out.println("Name-"+pn.getName()+" "+"Marks-"+pn.getMarks());
	}

}