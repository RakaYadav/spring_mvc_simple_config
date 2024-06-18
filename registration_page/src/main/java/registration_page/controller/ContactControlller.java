package registration_page.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import registration_page.service.UserService;

@Controller
public class ContactControlller {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	
	}
	
	
	
	@PostMapping("/processform")
	public String handleForm(@ModelAttribute registration_page.Model.User user,Model model) {
		userService.createUser(user);
		return "success";
		
	}
	/*
	@PostMapping("/processform")
	public String handleForm(@RequestParam("name") String userName,@RequestParam("email") String userEmail,@RequestParam("password") String userPassword,Model model) {
		model.addAttribute("name", userName);
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userPassword);
		return "success";
		
	}
*/



	
}
