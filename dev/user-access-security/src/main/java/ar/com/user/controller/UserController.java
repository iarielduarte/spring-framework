package ar.com.user.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import ar.com.user.model.User;

@Controller
@SessionAttributes("cmduser")
public class UserController {

	@RequestMapping(value = "addUser", method = RequestMethod.GET)
	public String addUser(Model model) {
		
		User user = new User();
		user.setName("Ariel");
		model.addAttribute("cmduser", user);
		
		return "addUser";

	}

	@RequestMapping(value = "addUser", method = RequestMethod.POST)
	public String updateUser(@Valid @ModelAttribute("cmduser") User user,
			BindingResult result) {

		if (result.hasErrors()) {
			System.out.println("Resutl has errors: " + result.hasErrors());
			return "addUser";
		}
		System.out.println("User updated :" + user.getName());

		return "redirect:addRole.html";
	}

}
