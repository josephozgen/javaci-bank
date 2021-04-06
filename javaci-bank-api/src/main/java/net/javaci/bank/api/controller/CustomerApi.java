package net.javaci.bank.api.controller;

import java.security.Principal;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaci.bank.api.dto.CustomerListDto;
import net.javaci.bank.api.dto.CustomerSaveDto;
import net.javaci.bank.db.model.Customer;

@RestController
@RequestMapping(CustomerApi.API_CUSTOMER_BASE_URL)
public class CustomerApi {

	static final String API_CUSTOMER_BASE_URL = "/api/customer";
	
	@Autowired
	private ModelMapper modelmapper;
	
	@PostMapping("/register")
	private Long add(@RequestBody CustomerSaveDto customerSaveDto) {
		
		Customer customer = modelmapper.map(customerSaveDto, Customer.class);
		
		return null;
	}
	
	@PutMapping("/update")
	private boolean update(@RequestBody CustomerSaveDto customerSaveDto, Principal user) {
		return false;
	}
	
	@GetMapping("/getInfo")
	private CustomerListDto getInfo(Principal user) {
		return null;
	}
}
