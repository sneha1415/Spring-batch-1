package org.cap.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	int studentId;
	String name;
	
	
	
	
	public Student() {
		super();
	}
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}
	
	
	

}
