package com.qxt.service;

import com.qxt.pojo.Student;

public interface StudentService {
	
	Student getById(int id);
	
	Student addAge(Student stu,int n);

}
