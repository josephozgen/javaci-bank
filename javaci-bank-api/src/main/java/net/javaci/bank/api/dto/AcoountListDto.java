package net.javaci.bank.api.dto;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AcoountListDto extends AccountSaveDto {
	
	@NotEmpty
	private Long id;
	
	@NotEmpty
	private String accountNumber;

}
