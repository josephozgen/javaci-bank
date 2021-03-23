package net.javaci.bank.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import net.javaci.bank.db.model.enumeration.CustomerStatusType;

@Getter @Setter @NoArgsConstructor
public class Customer extends UserEntityBase {
	private CustomerStatusType status;

	// private List<Account> accounts = new ArrayList<>();
}
