package com.springORM.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springORM.entities.Student;

public class studentDao {

private HibernateTemplate hibernateTemplate;
@Transactional
public String insert(Student student) {

//insert
String i = (String)this.hibernateTemplate.save(student);
return i;
}

//get the single data object
public Student getStudent(String studentId) {
Student student =this.hibernateTemplate.get(Student.class, studentId);
	return student;
}
//getting all rows
public List<Student> getAllStudent(){
	
List<Student> students = this.hibernateTemplate.loadAll(Student.class);
return students;
}
//deleting the data
@Transactional
public void deleteStudent(String studentId) {
Student student = this.hibernateTemplate.get(Student.class, studentId);
this.hibernateTemplate.delete(student);
}

//updating the data
@Transactional
public void updateStudent(Student student) {
	this.hibernateTemplate.update(student);
}

public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}


}
