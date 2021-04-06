package net.javaci.bank.api.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class UserBaseDto {
	
	@NotEmpty
	private String citizenNumber;
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String middleName;
	
	@NotEmpty
	private String lastName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Size(min = 10, max = 10)
	private LocalDate birthDate;
	
	@NotEmpty
	@Email
	private String email;
	
	private String phoneNumber;

}
