package net.javaci.bank.db.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

//import javax.annotation.PostConstruct;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import net.javaci.bank.db.model.Employee;
//import net.javaci.bank.db.model.enumeration.EmployeeRoleType;

@Component
public class EmployeeDao {
	
	@Autowired
	private ModelMapper modelMapper;
	
	/*
	@Autowired
	private PasswordEncoder passwordEncoder;
	*/
	
	private List<Employee> db = new ArrayList<Employee>();
	
	/*
	@PostConstruct
	private void init() {
		Employee e = new Employee();
		e.setFirstName("Joseph");
		e.setLastName("Ozgen");
		e.setEmail("user@javaci.net");
		e.setPassword(passwordEncoder.encode("a"));
		e.setRole(EmployeeRoleType.USER);
		db.add(e);
	}
	*/
 
	public List<Employee> findAll() {
		return db;
	}

	public boolean existsByCitizenNumber(String citizenNumber) {
		return db.stream().anyMatch(e -> e.getCitizenNumber().equals(citizenNumber));
	}

	public void save(Employee employeeEntity) {
		
		if (employeeEntity.getId() == null) {
			add(employeeEntity);
		} else {
			update(employeeEntity);
		}
	}

	public Optional<Employee> findById(Long id) {
		for (Employee employee : db) {
			if (employee.getId().equals(id)) {
				return Optional.of(employee);
			}
		}
		
		return Optional.empty();
	}
	
	public boolean existsById(Long id) {
		Optional<Employee> opt = findById(id);
		return opt.isPresent();
	}
	
	public void deleteById(Long id) {
		for (Employee employee : db) {
			if (employee.getId().equals(id)) {
				db.remove(employee);
				break;
			}
		}
		
	}
	
	private void add(Employee employee) {
		OptionalLong maxOption = db.stream().mapToLong(e -> e.getId()).max();
		long id;
		
		if (maxOption.isEmpty()) {
			id = 1;
		} else {
			id = maxOption.getAsLong() + 1;
		}
		employee.setId(id);
		
		db.add(employee);
	}
	
	private void update(Employee employeeEntity) {
		for (Employee employee : db) {
			if (employee.getId().equals(employeeEntity.getId())) {
				modelMapper.map(employeeEntity, employee);
				break;
			}
		}
	}

	public Employee findByEmail(String email) {
		for (Employee e : db) {
			if (e.getEmail().equals(email)) {
				return e;
			}
		}
		return null;
	}

}
