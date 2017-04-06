package com.wode.service;

import com.wode.bean.Student;

public interface IStudenService {

	
	public void saveStudent(Student student);
	
	public void updateStudent(Student student);
	
	public void deleteStudent(int id);
	
}
