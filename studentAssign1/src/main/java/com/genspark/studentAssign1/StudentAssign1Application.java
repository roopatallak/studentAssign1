package com.genspark.studentAssign1;

import com.genspark.studentAssign1.config.StudentApplicationConfig;
import com.genspark.studentAssign1.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;


public class StudentAssign1Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				StudentApplicationConfig.class);


		//SpringApplication.run(StudentAssign1Application.class, args);

		System.out.println("---");

		Student student = (Student) context.getBean("student");

		System.out.println("Student is " + student.getName() + student.getPh() + student.getAdd().getCity());

	}

}
