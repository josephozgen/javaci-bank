package net.javaci.bank.db.model;

public enum CustomerStatusType {
	
	ACTIVE,
    INACTIVE,
    UNAPPROVED;

    public static CustomerStatusType fromStr(String status) {
        return CustomerStatusType.valueOf(status.toUpperCase());
    }

}
