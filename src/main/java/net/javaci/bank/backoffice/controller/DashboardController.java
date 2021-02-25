package net.javaci.bank.backoffice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	
	@GetMapping({"/", "index", "index.html"})
	public String renderTemp() {
		return "dashboard";
	}
	
	@GetMapping("page1")
	public String renderPage1() {
		return "page1";
	}
	
	@GetMapping("page2")
	public String renderPage2() {
		return "page2";
	}
}
