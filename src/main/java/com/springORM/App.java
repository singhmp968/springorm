package com.springORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springORM.entities.Student;
import com.springORM.dao.studentDao;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
    

      studentDao studentDao = context.getBean("studentDao",studentDao.class);
    
//      Student student = new Student("123","durga","lucknow");
//      String  r= studentDao.insert(student);
//      System.out.println("done" + r);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    boolean go= true;
    while(go==true) {
    System.out.println("press 1 for add new student");
    System.out.println("press 2 for display all student");
    System.out.println("press 3 for getting details of all student");
    System.out.println("press 4 for delete student");
    System.out.println("press 5 for update student");
    System.out.println("press 6 exit");
    
    try {
    	
    	int input = Integer.parseInt(br.readLine());
    	switch(input) {
    	case 1:
    		//add a new student
    		System.out.println("enter id");
    		String uid = br.readLine();
    		System.out.println("enter name");
    		String uname = br.readLine();

    		System.out.println("enter city");
    		String ucity = br.readLine();

    		Student s= new Student();
    		s.setStudenrId(uid);
    		s.setStudentName(uname);
    		s.setStudentCity(ucity);
 
    		String  r= studentDao.insert(s);
    		System.out.println("done" + r);

    		System.out.println("************************************");
    		break;
    	case 2:
    		//dispaly all print
    		
    	List<Student> allStudents=studentDao.getAllStudent();
    
    	for(Student st : allStudents) {
    	System.out.println("name " + st.getStudentName() + " Id " + st.getStudenrId()  + "city " + st.getStudentCity());
    	
    	System.out.println("********************************************");
    	}
    	break;
    	
    	case 3:
    		//get the student data
    		System.out.println("enter id");
    		String userid = br.readLine();
    		Student student=studentDao.getStudent(userid);
    		System.out.println("name " + student.getStudentName() + " Id " + student.getStudenrId()  + "city " + student.getStudentCity());
    	break;
    	case 4:
    		//delete student

    		System.out.println("enter id");
    		String id = br.readLine();
    		studentDao.deleteStudent(id);
    		System.out.println("student deleted");

    		break;
    		
    	case 5:
    		//upadate the student
    		
    		break;
    		
    	case 6:
    		//exit
    		go=false;
    		break;
    	}
    	
    }catch (Exception e) {
		// TODO: handle exception
System.out.println("invalidate");
    }
    
    }
    }
}
