package net.javaci.bank.backoffice.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.javaci.bank.db.model.Employee;
import net.javaci.bank.db.model.enumeration.EmployeeRoleType;
import net.javaci.bank.db.model.enumeration.EmployeeStatusType;

@Getter @Setter @ToString
public class EmployeeDto extends Employee {
	
	private String confirmPassword;
}
