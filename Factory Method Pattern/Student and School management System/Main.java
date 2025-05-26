package com.main;

import com.school.School;
import com.student.Student;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-----------Example 1-------------");
		//Example 1:
		School s1=School.getSchoolObject("Saraswati School", "KPHB 123", "Vidyā dadāti vinayam");
		Student s2=Student.getStudentObject("Sivaji", "A+", s1, 98);
		if(s1==null||s2==null) {
			System.out.println("Invalid details.");
		}
		else {
			System.out.println(s1);
			System.out.println(s2);
		}
		System.out.println("-----------Example 2-------------");
		//Example 1:
		
		School s4=School.getSchoolObject("Saraswati School", "123 hyd", "Vidyā dadāti vinayam");
		Student s5=Student.getStudentObject("Sivaji", "A+", s4, -10);
		if(s4==null||s5==null) {
			System.out.println("Invalid details.");
		}
		else {
			System.out.println(s4);
			System.out.println(s5);
		}
		
		System.out.println("-----------Example 3-------------");
		//Example 1:
		School s6=School.getSchoolObject("Saraswati School", null, "Vidyā dadāti vinayam");
		Student s7=Student.getStudentObject("Sivaji", "A+", s6, 98);
		if(s6==null||s7==null) {
			System.out.println("Invalid details.");
		}
		else {
			System.out.println(s6);
			System.out.println(s7);
		}
		

	}

}
