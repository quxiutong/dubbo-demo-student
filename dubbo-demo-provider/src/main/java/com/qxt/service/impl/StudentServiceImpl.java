package com.qxt.service.impl;

import com.qxt.pojo.Student;
import com.qxt.service.StudentService;

public class StudentServiceImpl implements StudentService {

	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(20);
		student.setId(id);
		student.setName("zhangsan"+id);
		return student;
	}

	public Student addAge(Student stu, int n) {
		// TODO Auto-generated method stub
		stu.setAge(stu.getAge()+n);
		return stu;
	}

}
