package Bookcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import BookModel.Bookmodel;
import Bookservice.Bookinterservice;

@Controller
public class controller {
	@Autowired
	Bookinterservice service;

	@RequestMapping("/")
	public String summa(Model theModel) {
		theModel.addAttribute("stu",new Bookmodel());
		return "home";
	}

	@RequestMapping("/insertUser")
	public String insertUser(@ModelAttribute("stu") Bookmodel s1,Model theModel) {
		service.createStudent(s1);
		List<Bookmodel> students = service.getStudents();
		theModel.addAttribute("students",students);
		return "success";
	}

	@RequestMapping("/read")
	public String read(Model theModel) {
		List<Bookmodel> students = service.getStudents();
		theModel.addAttribute("students",students);
		return "success";
	}

	@RequestMapping("/editStudent")
	public String editStudent(@RequestParam("id") String id,Model theModel) {
		theModel.addAttribute("stu",service.getStudent(id));
		return "home";
	}


	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("id") String id) {
		Bookmodel s1 = service.getStudent(id);
		service.deleteUser(s1);
		return "redirect:/read";
	}


	}

