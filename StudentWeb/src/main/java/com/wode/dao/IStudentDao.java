package com.wode.dao;

import com.wode.bean.Student;

public interface IStudentDao {

	
	public void saveStudent(Student student);
	
	public void updateStudent(Student student);
	
	public void deleteStudent(int id);
}
