package com.ciq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ciq.pojo.Student;

@Repository
public class Studentimpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jtemp;

	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp = jtemp;
	}

	@Override
	public List<Student> getAll() {

	String retrive="select * from Student";
		List<Student> list = jtemp.query(retrive, new RowMapper<Student>() {
			
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

				Student s= new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setFee(rs.getDouble(3));
				return s;
			}
		});
		
		return list;
	}

	@Override
	public int insert(Student student) {
String s2="insert into Student values(?,?,?)";
 int i = jtemp.update(s2,new Object[] {student.getId(), student.getName(), student.getFee()});
		return i;
	}

	@Override
	public int delete(int id) {
		String delete="delete from student where id=?";
        Object[]d= {id};
        int d1 = jtemp.update(delete, d);
        System.out.println(d1);
		return d1;
	}

	@Override
	public int update(Student student) {
String u="update student set name=?,fee=? where id=?";
Object[]d= {student.getName(), student.getFee(), student.getId()};
int u1=jtemp.update(u,d);
System.out.println(u1);
		return u1;
	}

	@Override
	public Student getbyid(int id) {
	return	jtemp.queryForObject("select * from student where id=?", 
				new BeanPropertyRowMapper<>(Student.class),new Object[] {id});
		
	}

	
	
}
