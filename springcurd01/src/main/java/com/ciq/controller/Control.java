package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.dao.Studentimpl;
import com.ciq.pojo.Student;

@Controller
public class Control {

	@Autowired
	private Studentimpl simpl;
	@GetMapping("/get")
	public ModelAndView getAll() {
		List<Student> list = simpl.getAll();
		return new ModelAndView("curd", "ret", list);

	}

	@PostMapping("/jk")
	public String get(Student student) {
		simpl.insert(student);
		return "redirect:get";

	}

	@GetMapping("/add")
	public String add() {
		return "save";
	}
	
	
	@GetMapping("/delete")
	public String delete (int id) {
		simpl.delete(id);
		return "redirect:get";
		
	}
	@GetMapping("/update")
	public ModelAndView update(@RequestParam int id) {
		Student getbyid = simpl.getbyid(id);
		return new ModelAndView("update","map",getbyid);
		
	}
	@PostMapping("/pk")
	public String updated(Student student) {
		simpl.update(student);
		return "redirect:get";
		
	}
	
	
	
}
