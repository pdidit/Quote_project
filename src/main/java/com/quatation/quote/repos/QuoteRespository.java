package com.quatation.quote.repos;

import com.quatation.quote.domain.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public interface QuoteRespository extends JpaRepository<Quote, Integer> {
}
