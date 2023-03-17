package com.ciq.dao;

import java.util.List;

import com.ciq.pojo.Student;

public interface StudentDao {
	
	 List<Student> getAll();
	 
	int insert (Student student);
	
	int delete (int id);
	
	int update (Student student);
	
	Student getbyid(int id);
	
	
}
