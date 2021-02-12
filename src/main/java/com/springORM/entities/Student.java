package com.springORM.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {
	@Id
	@Column(name="studentId")
	private String studenrId;
	@Column(name="studentName")
	private String studentName;
	@Column(name="studentCity")
	private String studentCity;
	public Student(String studenrId, String studentName, String studentCity) {
		super();
		this.studenrId = studenrId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudenrId() {
		return studenrId;
	}
	public void setStudenrId(String studenrId) {
		this.studenrId = studenrId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	
	
}
