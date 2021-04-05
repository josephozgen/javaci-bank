package net.javaci.bank.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaci.bank.api.dto.AccountSaveDto;
import net.javaci.bank.api.dto.AcoountListDto;
import net.javaci.bank.db.model.Customer;

@RestController
@RequestMapping(AccountApi.API_ACCOUNT_BASE_URL)
public class AccountApi {

	public static final String API_ACCOUNT_BASE_URL = "/api/account";

	@GetMapping("/list")
	public List<Object> listAll(String citizenNumber){
		
		Customer customer = null; // citizenNumber ile dao'dan musteriyi al
		return null;
	}
	
	@PostMapping("/create")
	public Long create(@RequestBody AccountSaveDto newAccountDto) {
		return null;
	}
	
	@GetMapping("/getInfo")
	public AcoountListDto getInfo(@RequestBody Long accountId) {
		return null;
	}
	
	@PostMapping("/close")
	public AcoountListDto close(@RequestBody Long accountId) {
		return null;
	}
}