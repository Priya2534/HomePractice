package com.homepractice;

// You can not create object of abstract class..so what is the need of abstract class constructor
// if abstract class contains 50 fields and also has 100 child class then without abstract class constructor 
//you have to write initialization in every child class ..reduces the code reusablity
public abstract class AbstractionPractice {

	 String name;
	 int age;
	
	public AbstractionPractice(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		
		
		
	}
	class Student extends AbstractionPractice{
		int rollno;
		int marks;
		public Student(String name, int age, int rollno, int marks) {
			super(name, age);
			this.rollno = rollno;
			this.marks = marks;
		}
		Student s = new Student("Priya", 30, 20, 89);
		
		
		
	}

}
