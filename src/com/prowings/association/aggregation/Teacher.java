package com.prowings.association.aggregation;

import java.util.Arrays;

public class Teacher {
	
	private int teacherId;
	private String teacherName;
	private Student[] students;

	public Teacher() {
		System.out.println("Default Constructor");
	}

	public Teacher(int teacherId, String teacherName, Student[] students) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.students = students;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", students="
				+ Arrays.toString(students) + "]";
	}
	
	public Student[] viewAllStudents() {
		return students;
	}

}
