package Encapsulation;

public class Student 
{
	
	String name;
	int rollno;
	int age;
	
	Student(String name,int rollno,int age)
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}
	public String addname()
	{
		return name;
	}
	public int addrollno()
	{
		return rollno;
	}
	public int addage()
	{
		return age;
	}
	public String toString()
	{
		return "name: "+name+" rollno: "+rollno+" age: "+age; 
	}
	public static void main(String[] args) 
	{
		Student obj = new Student("Akshay",108,23);
		System.out.println(obj);
		
	}

}
