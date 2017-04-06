package com.wode.dao.impl;

import com.wode.bean.Student;
import com.wode.dao.IStudentDao;

public class StudentDaoImpl implements IStudentDao {

	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("增加了学生信息"+student.getStuName());
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("修改了学生信息");
	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		System.out.println("删除了学生信息");
	}

}
