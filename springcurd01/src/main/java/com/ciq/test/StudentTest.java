package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.dao.Studentimpl;
import com.ciq.pojo.Student;

public class StudentTest {
public static void main(String[] args) {
	
	ApplicationContext ap= new ClassPathXmlApplicationContext("springc.xml");
	Studentimpl si=(Studentimpl) ap.getBean("dao");
//	System.out.println(si.getAll());
	Student stu= new Student(12, "raju", 2500.00);
	System.out.println(si.insert(stu));
	
}
}
