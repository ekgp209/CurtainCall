package com.cc.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlaceController {
	@RequestMapping("/place")
	public String list(Model model){
		
		return "placelist";
	}
}
