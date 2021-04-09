package net.javaci.bank.api.dto;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import net.javaci.bank.db.model.enumeration.AccountCurrency;

@Getter @Setter
public class ExchangeTransactionDto {

    @NotNull
    private Long accountId;
    
    private AccountCurrency currency;
    
    @Min(value = 1)
    private BigDecimal count;
    
}
