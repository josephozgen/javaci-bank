package net.javaci.bank.db.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Employee {
	private Long id;
	
    private String citizenNumber;
    
    private String firstName;
    
    private String lastName;
}
