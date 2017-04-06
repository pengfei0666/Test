package com.wode.bean;

public class Student {
		private int id;
		private String stuName;
		private int age;
		private String gender;
						
		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int id, String stuName, int age, String gender) {
			super();
			this.id = id;
			this.stuName = stuName;
			this.age = age;
			this.gender = gender;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getStuName() {
			return stuName;
		}
		public void setStuName(String stuName) {
			this.stuName = stuName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
}
