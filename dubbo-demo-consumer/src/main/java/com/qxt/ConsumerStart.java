package com.qxt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qxt.pojo.Student;
import com.qxt.service.StudentService;

public class ConsumerStart {
	private static ClassPathXmlApplicationContext context;
	private static StudentService studentService;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		
		
		studentService = context.getBean(StudentService.class);
		
		Student student = studentService.getById(20);
		System.out.println("stuent is "  + student);
		
		Student addAge = studentService.addAge(student, 3);
		
		System.out.println("加岁数以后的数据 "  + addAge);
		
		
		
		
	}
}
