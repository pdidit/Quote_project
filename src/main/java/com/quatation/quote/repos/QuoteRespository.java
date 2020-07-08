package com.quatation.quote.repos;

import com.quatation.quote.domain.Job;
import com.quatation.quote.domain.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRespository extends JpaRepository<Quote, Integer> {
}
