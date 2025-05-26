package com.student;

import com.school.School;

public class Student {

	//private instance variables
	private String studentName;
	private String grade;
	private School school;
	private double averageMarks;
	
	//private constructor
	private Student(String studentName,String grade, School school,double averageMarks) {
		this.studentName=studentName;
	    this.grade=grade;
	    this.school= school;
		this.averageMarks=averageMarks;	
	}
	
	//setters
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public void setSchool(School school) {
		this.school= school;;
	}
	public void setAverageMarks(double averageMarks) {
		if(averageMarks<0||averageMarks>100) {
			System.out.println("Invalid Marks");
		}
		else {
			
		    this.averageMarks=averageMarks;	
		}
	}
	
	
	//getters
	public String getStudentName() {
		return this.studentName;
	}
	public String getGrade() {
		return this.grade;
	}
	public School getSchool() {
		return this.school;
	}
	public double getAverageMarks() {
		return this.averageMarks;	
	}
	
	@Override
	public String toString() {
		return "Student Name:"+this.studentName+"\nGrade:"+this.grade+"\nAverage Marks"+this.averageMarks;
	}
	
	//Indirectly creating object of Student
	public static Student getStudentObject(String studentName,String grade, School school,double averageMarks) {
		if(averageMarks<0||averageMarks>100||school==null) {
			return null;
		}
		return new Student(studentName,grade, school,averageMarks);
	}
	
}
