package com.ciq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {

@RequestMapping("/ran")
public String getmsg() {
	return "Viewer";
}

}
