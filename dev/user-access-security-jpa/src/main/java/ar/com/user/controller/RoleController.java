package ar.com.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.com.user.model.Role;

@Controller
public class RoleController {
	
	@RequestMapping(value="/addRole")
	public String addRole(@ModelAttribute ("role") Role role){
		System.out.println("Role :"+role.getRoles());
		return "addRole";
	}

}
