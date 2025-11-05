package com.prowings.association.aggregation;

public class TestAggregation {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Student student1 = new Student(101, "John");
		Student student2 = new Student(102, "Alice");
		
		System.out.println("Student 1 = "+student1);
		System.out.println("Student 2 = "+student2);
		
		System.out.println("Hashcode of student1 = "+student1.hashCode());
		
		Student[] students = {student1, student2};
		
		Teacher teacher = new Teacher(1, "Mr. Smith", students);
		
		System.out.println("Teacher = "+teacher);
		
		Student[] studentsListOfTeacher = teacher.viewAllStudents();
		
		for (Student s : studentsListOfTeacher) 
		{
			System.out.println(s);
		}
		
		System.out.println("main method ended");
	}

}
