package com.ciq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {

//	@RequestMapping(value = "/ram", method = RequestMethod.GET)
//	public ModelAndView getvalue(@RequestParam("textone") int a, @RequestParam("texttwo") int b) {
//		return new ModelAndView("Viewer", "ram", a + b);
//	}

	@RequestMapping(value = "/ram", method = RequestMethod.GET)
	public ModelAndView getvalues(@RequestParam("textone") int d, @RequestParam("texttwo") int e) {
		return new ModelAndView("Viewer", "ran", d + e);
	}
}
