package com.wode.dao.impl;

import com.wode.bean.Student;
import com.wode.dao.IStudentDao;

public class StudentDaoImpl implements IStudentDao {

	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("������ѧ����Ϣ"+student.getStuName());
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("�޸���ѧ����Ϣ");
	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		System.out.println("ɾ����ѧ����Ϣ");
	}

}
