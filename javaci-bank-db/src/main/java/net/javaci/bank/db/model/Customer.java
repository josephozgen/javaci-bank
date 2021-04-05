package net.javaci.bank.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import net.javaci.bank.db.model.enumeration.AccountStatusType;

@Getter @Setter @NoArgsConstructor
public class Customer extends UserEntityBase {
	private AccountStatusType status;

	// private List<Account> accounts = new ArrayList<>();
}
