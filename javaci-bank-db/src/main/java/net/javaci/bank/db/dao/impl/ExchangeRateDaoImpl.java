package net.javaci.bank.db.dao.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaci.bank.db.model.ExchangeRate;
import net.javaci.bank.db.model.enumeration.AccountCurrency;

public interface ExchangeRateDaoImpl extends JpaRepository<ExchangeRate, Long> {
	
	List<ExchangeRate> findAllByDate(LocalDate exchangeRateDate);

	boolean existsByDate(LocalDate date);

	boolean existsByDateAndCurrency(LocalDate date, AccountCurrency currency);

	ExchangeRate findByDateAndCurrency(LocalDate date, AccountCurrency currency);
}
