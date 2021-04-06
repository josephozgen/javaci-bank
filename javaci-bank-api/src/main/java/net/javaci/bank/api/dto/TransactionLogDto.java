package net.javaci.bank.api.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TransactionLogDto {
	
	private Long id;
	
	private String toCustomerName;
	
	private Long toAccountoId;
	
	private BigDecimal amount;
	
	private String type;
	
	private String description;
	
	
}
