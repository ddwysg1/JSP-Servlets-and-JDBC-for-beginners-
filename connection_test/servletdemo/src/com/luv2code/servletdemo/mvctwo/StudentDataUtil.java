package com.luv2code.servletdemo.mvctwo;

import java.util.*;

public class StudentDataUtil {
	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Mary", "Public", "mary@luv2code.com"));
		students.add(new Student("Jack", "Johns", "jack@luv2code.com"));
		students.add(new Student("Steve", "Rogers", "steve@luv2code.com"));
		students.add(new Student("Mike", "Jones", "mike@luv2code.com"));
		
		return students;
	}
}