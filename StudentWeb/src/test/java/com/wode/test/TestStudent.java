package com.wode.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wode.bean.Student;
import com.wode.service.IStudenService;

public class TestStudent {

	private ApplicationContext ac;
	private IStudenService studentService;
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		studentService = (IStudenService) ac.getBean("StudentServiceImpl");
	}
	@Test
	public void testSaveStudent(){
		Student stu = (Student) ac.getBean("student");
		try {
			studentService.saveStudent(stu);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
}
