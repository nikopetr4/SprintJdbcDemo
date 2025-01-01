package com.petroudis.SpringJDBCDemo;

import com.petroudis.SpringJDBCDemo.model.Student;
import com.petroudis.SpringJDBCDemo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNumber(104);
		s.setName("Petroudis");
		s.setMarks(78);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
