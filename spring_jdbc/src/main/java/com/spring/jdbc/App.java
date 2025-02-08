package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/jdbcconfig.xml");
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
    	
    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//    	StudentDaoImpl studentDaoImpl = context.getBean("studentdaoimpl", StudentDaoImpl.class);
    	
//    	Insert Query Method
//    	Student student = new Student();
//    	student.setId(500);
//    	student.setName("Vijay Mahajan");
//    	student.setCity("Dasnur");   	
//    	int result = studentDao.insert(student); 	
//    	System.out.println("Student Added : "+result);
    	
//    	Update Query Method
//    	Student student = new Student();
//    	student.setId(500);
//    	student.setName("Ram Desai");
//    	student.setCity("Indore");
//    	int result = studentDao.update(student);
//    	System.out.println("Student Updated : "+result);
  
//    	Delete Query Method
//    	int result = studentDao.delete(400);
//    	System.out.println("Student Deleted : "+result);
    	
//   	Delete Query Method Using Input
//    	Scanner in = new Scanner(System.in);
//    	System.out.println("Enter student id to delete : ");
//    	int studentID = in.nextInt();
//    	
//    	int result = studentDao.delete(studentID);
//    	System.out.println("Student Deleted : "+result);
    	
    	
    	
//    	Display Query Method	
//    	Student student = studentDao.getStudent(100);
//    	System.out.println(student);

    	
    	
//    	Display All data
    	List<Student> students = studentDao.getAllStudents();
    	for(Student s : students) {
    		System.out.println(s);
    	}
    	
    	
    	
    	
    	
    	
    	
//    	JdbcTemplate temp = context.getBean("jdbcTemplate", JdbcTemplate.class);
//    	
//    	// Insert query
//        String query = "insert into student(id, name, city) values (?, ?, ?)";
//    	
//        // Execute the query
//        int result = temp.update(query, 300, "Shyam Mahajan", "Savda");
//    	
//    	System.out.println(result+" record(s) inserted.");
       
    }
}
