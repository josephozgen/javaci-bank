package net.javaci.bank.backoffice.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.javaci.bank.db.model.enumeration.EmployeeRoleType;
import net.javaci.bank.db.model.enumeration.EmployeeStatusType;

@Getter @Setter @ToString
public class EmployeeUpdateDto {
private Long id;
	
    private String citizenNumber;
    
    @NotEmpty
    @Size(min = 2, max = 32)
    private String firstName;
    
    private String middleName;
    
    @NotEmpty
    @Size(min = 2, max = 32)
    private String lastName;
    
    @NotEmpty
    @Size(min = 2, max = 64)
    private String email;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;
    
    private String phoneNumber;
    
    private EmployeeStatusType status;
    
    private EmployeeRoleType role = EmployeeRoleType.USER;
}
