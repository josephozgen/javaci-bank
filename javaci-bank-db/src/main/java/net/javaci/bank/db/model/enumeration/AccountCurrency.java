package net.javaci.bank.db.model.enumeration;

public enum AccountCurrency {
	
	TL("TRY"),
    USD("USD"),
    EURO("EUR"),
    GOLD("GOLD");
    
    public final String code;
    
    AccountCurrency(String code) {
        this.code = code;
    }
}
