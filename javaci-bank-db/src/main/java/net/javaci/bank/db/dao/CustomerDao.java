package net.javaci.bank.db.dao;

import java.util.Optional;

import net.javaci.bank.db.model.Customer;

public interface CustomerDao {
	
	Optional<Customer> findByCitizenNumber(String citizenNumber);

    void save(Customer customer);
}
