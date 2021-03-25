package net.javaci.bank.backoffice.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaci.bank.backoffice.service.RestoreDBService;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private RestoreDBService restoreDBService;

	@GetMapping("/giris")
	public String girisPage(Model model, Principal user) {
		if (user != null) {
			return "redirect:/";
		}
		
		restoreDBService.checkEmptyDB();
		
		return "user/login";
	}
}
