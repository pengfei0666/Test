package com.wode.service.impl;

import com.wode.bean.Student;
import com.wode.dao.IStudentDao;
import com.wode.service.IStudenService;

public class StudentServiceImpl implements IStudenService {
	
	private IStudentDao dao;
	
	
	public StudentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentServiceImpl(IStudentDao dao) {
		super();
		this.dao = dao;
	}

	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		dao.saveStudent(student);
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		dao.updateStudent(student);
	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		dao.deleteStudent(id);
	}



}
